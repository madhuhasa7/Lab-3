package com.info.test;



import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.info.facade.TrimmerFacade;
import com.info.facade.TrimmerType;

public class TestTrimmerFacade {
	
	TrimmerFacade trimeFacade = new TrimmerFacade();
	
	@Test
	public void testOrderTrimmerWithValidType() {
	 	
		assertNotNull(trimeFacade.getTrimmerSpecs(TrimmerType.BATTERY));
	}

	@Test
	public void testOrderCakeWithInValidCakeType() {
	 	try {
	 		assertNull(trimeFacade.getTrimmerSpecs(TrimmerType.BATTERY));
	 	}
		catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
	

}
