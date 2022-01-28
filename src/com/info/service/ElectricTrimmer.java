package com.info.service;

public class ElectricTrimmer implements StringTrimmers {
	
	
	@Override
	public void getTrimmerModel() {
		// TODO Auto-generated method stub
		System.out.println("Electric Trimmer model with 2 years of warranty ");
	}

	@Override
	public Integer getCostOfTrimmer() {
		// TODO Auto-generated method stub
		return 15000;
	}

}
