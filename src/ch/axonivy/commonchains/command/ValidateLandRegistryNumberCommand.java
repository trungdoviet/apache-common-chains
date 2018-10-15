package ch.axonivy.commonchains.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import ch.axonivy.commonchains.model.Dossier;

public class ValidateLandRegistryNumberCommand implements Command{

	@Override
	public boolean execute(Context context) throws Exception {
		System.out.println("===Running " + this.getClass().getSimpleName());
		Dossier dossier = (Dossier) context.get("dossier");
		
		if(dossier.getSecurity().getLandRegistryNumber().contains("FF")){
			return true;
		}
		return false;
	}

}
