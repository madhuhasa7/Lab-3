package com.info.service;

public class BatteryTrimmer implements StringTrimmers{

	@Override
	public void getTrimmerModel() {
		// TODO Auto-generated method stub
		System.out.println("Battery Trimmer model with 6months of warranty ");
	}

	@Override
	public Integer getCostOfTrimmer() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
