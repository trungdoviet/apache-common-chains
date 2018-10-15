package ch.axonivy.commonchains.command2;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import ch.axonivy.commonchains.context.CobPageActionContext;
import ch.axonivy.commonchains.enums.ChainResult;

public abstract class AbstractCobCommand implements Command {

	@Override
	public boolean execute(Context context) throws Exception {
		if(!(context instanceof CobPageActionContext)){
			throw new IllegalArgumentException("Context must be type of CobPageContext");
		}
		ChainResult chainResult = execute((CobPageActionContext)context);
		return chainResult == ChainResult.STOP;
	}
	
	public abstract ChainResult execute(CobPageActionContext context) throws Exception ;

}
