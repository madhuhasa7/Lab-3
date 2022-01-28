package com.info.client;

import com.info.cmd.BuyTrimmer;
import com.info.cmd.DontBuy;
import com.info.cmd.RemoteControl;
import com.info.cmd.TrimmerDecider;
import com.info.facade.TrimmerFacade;
import com.info.facade.TrimmerType;

public class OrderTrimmers {
	
	public static void main(String[] args) {
		
		//Facade pattern to show the description
		TrimmerFacade.getTrimmerSpecs(TrimmerType.BATTERY);
		TrimmerFacade.getTrimmerSpecs(TrimmerType.ELECTRIC);
		
		//Command pattern to buy/ignore the order 
		
		RemoteControl control = new RemoteControl();
		TrimmerDecider trimmerDecider = new TrimmerDecider();
		control.setCommand(new BuyTrimmer(trimmerDecider));
		control.pressButton();
		
		control.setCommand(new DontBuy(trimmerDecider));
		control.pressButton();
		
		
	}

}
