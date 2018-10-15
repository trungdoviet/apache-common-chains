package ch.axonivy.commonchains.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class SaveDossierCommand implements Command {

	@Override
	public boolean execute(Context context) throws Exception {
		System.out.println("===Running " + this.getClass().getSimpleName());
		System.out.println("Context:" + context);
		return false;
	}

}
