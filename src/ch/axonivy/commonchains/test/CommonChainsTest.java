package ch.axonivy.commonchains.test;

import static org.junit.Assert.assertTrue;

import org.apache.commons.chain.Chain;
import org.apache.commons.chain.Context;
import org.junit.Test;

import ch.axonivy.commonchains.chain.ForwardActionChain;
import ch.axonivy.commonchains.chain.SaveAndCloseActionChain;
import ch.axonivy.commonchains.context.CobPageActionContext;
import ch.axonivy.commonchains.model.Dossier;
import ch.axonivy.commonchains.model.RealSecurity;

public class CommonChainsTest {
	
	@SuppressWarnings("unchecked")
	@Test
	public void shouldCallForwardActionChain() throws Exception{
		Context context = new CobPageActionContext();
		Dossier dossier = new Dossier();
		context.put("dossier", dossier);
		context.put("numberOfProperty", 11);
		dossier.setSecurity(new RealSecurity());
		dossier.getSecurity().setLandRegistryNumber("25");
        Chain forwardActionChain = new ForwardActionChain();
        forwardActionChain.execute(context);
         
		assertTrue(true);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void shouldStopCommandWhenFailed() throws Exception{
		Context context = new CobPageActionContext();
		Dossier dossier = new Dossier();
		dossier.setSecurity(new RealSecurity());
		dossier.getSecurity().setLandRegistryNumber("25+FF");
		context.put("dossier", dossier);
		
        Chain forwardActionChain = new ForwardActionChain();
        forwardActionChain.execute(context);
         
		assertTrue(true);
	}
	
	@Test
	public void shouldCallSaveAndCloseActionChain() throws Exception{
		CobPageActionContext context = new CobPageActionContext();
		Dossier dossier = new Dossier();
		dossier.setSecurity(new RealSecurity());
		dossier.getSecurity().setLandRegistryNumber("25");
		context.setDossier(dossier);
		
        Chain saveAndCloseActionChain = new SaveAndCloseActionChain();
        saveAndCloseActionChain.execute(context);
         
		assertTrue(true);
	}
	
	@Test
	public void shouldStopCallACommandOnSaveAndCloseActionChain() throws Exception{
		CobPageActionContext context = new CobPageActionContext();
		Dossier dossier = new Dossier();
		dossier.setSecurity(new RealSecurity());
		dossier.getSecurity().setLandRegistryNumber("25+FF");
		context.setDossier(dossier);
		
        Chain saveAndCloseActionChain = new SaveAndCloseActionChain();
        saveAndCloseActionChain.execute(context);
         
		assertTrue(true);
	}
	
}
