package com.kh.test240122;

public class TV {
	
	private String brand;
	private int year;
	private int size;
	private int price;
	
	public TV(String brand, int year, int size,int price) {
		this.brand=brand;
		this.year=year;
		this.size=size;
		this.price=price;
	}
	
	
	public void show() {
		System.out.println(this.brand+"에서 만든 "+this.year+"년 "
				+this.size+"인치 TV 는"+price+"원 입니다.");
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	
}
