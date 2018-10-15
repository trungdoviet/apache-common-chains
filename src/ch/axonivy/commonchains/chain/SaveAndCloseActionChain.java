package ch.axonivy.commonchains.chain;

import org.apache.commons.chain.impl.ChainBase;

import ch.axonivy.commonchains.command2.SaveDossierCommand2;
import ch.axonivy.commonchains.command2.ValidateLandRegistryNumberCommand2;

public class SaveAndCloseActionChain extends ChainBase{
	public SaveAndCloseActionChain() {
        super();
        addCommand(new ValidateLandRegistryNumberCommand2());
        addCommand(new SaveDossierCommand2());
    }
}
