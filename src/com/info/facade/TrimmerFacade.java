package com.info.facade;

import com.info.service.BatteryTrimmer;
import com.info.service.ElectricTrimmer;
import com.info.service.StringTrimmers;

public class TrimmerFacade {
	
	
	public static void getTrimmerSpecs(TrimmerType type) {
		switch (type) {
		case ELECTRIC:
			StringTrimmers electric = new ElectricTrimmer();
			electric.getTrimmerModel();
		    System.out.println("Cost of electric Trimmers--->"+electric.getCostOfTrimmer());
		    break;
		case BATTERY:
			StringTrimmers battery = new BatteryTrimmer();
			battery.getTrimmerModel();
			System.out.println("Cost of battery Trimmers---->"+battery.getCostOfTrimmer());
			break;
		    
		}
		
	}

}
