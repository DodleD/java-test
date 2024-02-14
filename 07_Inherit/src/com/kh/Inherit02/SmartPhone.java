package com.kh.Inherit02;

public class SmartPhone extends Product{
	private String mobileAgency;
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
		
		
	}


	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + " 통신사 : "+ this.mobileAgency;
	}


	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	
	
	
	
}
