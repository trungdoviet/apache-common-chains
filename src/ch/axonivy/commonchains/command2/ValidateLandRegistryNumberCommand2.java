package ch.axonivy.commonchains.command2;

import ch.axonivy.commonchains.context.CobPageActionContext;
import ch.axonivy.commonchains.enums.ChainStatus;
import ch.axonivy.commonchains.model.Dossier;

public class ValidateLandRegistryNumberCommand2 extends AbstractCobCommand{

	@Override
	public ChainStatus execute(CobPageActionContext context) throws Exception {
		System.out.println("===Running " + this.getClass().getSimpleName());
		Dossier dossier = context.getDossier();
		
		if(dossier.getSecurity().getLandRegistryNumber().contains("FF")){
			return ChainStatus.STOP;
		}
		return ChainStatus.CONTINUE;
	}
}
