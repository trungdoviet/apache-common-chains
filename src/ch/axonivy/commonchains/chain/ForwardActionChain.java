package ch.axonivy.commonchains.chain;

import org.apache.commons.chain.impl.ChainBase;

import ch.axonivy.commonchains.command.SaveDossierCommand;
import ch.axonivy.commonchains.command.ValidateLandRegistryNumberCommand;

public class ForwardActionChain extends ChainBase{
	public ForwardActionChain() {
        super();
        addCommand(new ValidateLandRegistryNumberCommand());
        addCommand(new SaveDossierCommand());
    }
}
