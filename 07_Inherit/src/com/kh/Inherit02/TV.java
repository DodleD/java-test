package com.kh.Inherit02;

public class TV extends Product{

	private int inch;
	
	public TV(String brand, String pCode, String pName, int price,int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
		
		
	}
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + " 인치 : "+ this.inch;
	}
	

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	
}
