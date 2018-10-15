package ch.axonivy.commonchains.command2;

import ch.axonivy.commonchains.context.CobPageActionContext;
import ch.axonivy.commonchains.enums.ChainStatus;

public class SaveDossierCommand2 extends AbstractCobCommand {

	@Override
	public ChainStatus execute(CobPageActionContext context) throws Exception {
		System.out.println("===Running " + this.getClass().getSimpleName());
		return ChainStatus.CONTINUE;
	}

}
