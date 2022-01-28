package com.info.cmd;

public class BuyTrimmer implements Command {
	TrimmerDecider buyDecider;

	public BuyTrimmer(TrimmerDecider buyDecider) {
		super();
		this.buyDecider = buyDecider;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		buyDecider.buy();
	}
}
