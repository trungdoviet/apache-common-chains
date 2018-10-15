package ch.axonivy.commonchains.context;

import org.apache.commons.chain.impl.ContextBase;

import ch.axonivy.commonchains.model.Dossier;

public class CobPageActionContext extends ContextBase {

	private static final long serialVersionUID = -70971926428809223L;
	private Dossier dossier;
	private int numberOfProperty;

	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}

	public int getNumberOfProperty() {
		return numberOfProperty;
	}

	public void setNumberOfProperty(int numberOfProperty) {
		this.numberOfProperty = numberOfProperty;
	}
	
	
}
