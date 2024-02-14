package com.kh.Inherit02;

public class Desktop extends Product {
	private boolean allinOne;
	
	
	public Desktop(String brand, String pCode, String pName, int price,boolean allinOne) {
		super(brand, pCode, pName, price);
		this.allinOne = allinOne;
		
		
	}
	
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + " 올인원인가? : "+ this.allinOne;
	}
	//super. 으로 부모에게 접근이 가능하다.
	//오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의하는 것.


	public boolean isAllinOne() {
		return allinOne;
	}


	public void setAllinOne(boolean allinOne) {
		this.allinOne = allinOne;
	}
}
