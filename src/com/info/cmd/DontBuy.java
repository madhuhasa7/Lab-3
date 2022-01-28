package com.info.cmd;

public class DontBuy implements Command {
    TrimmerDecider decider;
    
    
	public DontBuy(TrimmerDecider decider) {
		super();
		this.decider = decider;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		decider.dontBuy();
	}

	
	
}
