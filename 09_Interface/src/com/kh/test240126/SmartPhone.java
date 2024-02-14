package com.kh.test240126;

abstract public class SmartPhone implements CellPhone, TouchDisplay {
	private String maker;

	public SmartPhone() {
		this.maker="";
	}
	
	abstract public String printInformation();
	
	public void setMaker(String maker) {
		this.maker=maker;
	}

	protected String getMaker() {
		return maker;
	}
	
	
}
