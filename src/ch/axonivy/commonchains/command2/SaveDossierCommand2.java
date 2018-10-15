package ch.axonivy.commonchains.command2;

import ch.axonivy.commonchains.context.CobPageActionContext;
import ch.axonivy.commonchains.enums.ChainResult;

public class SaveDossierCommand2 extends AbstractCobCommand {

	@Override
	public ChainResult execute(CobPageActionContext context) throws Exception {
		System.out.println("===Running " + this.getClass().getSimpleName());
		return ChainResult.CONTINUE;
	}

}
