package com.kh.test2401262;

public class Dog extends Animal{
	public final static String PLACE = "애견카페";
	int weight;
	
	public Dog() {
		
	}

	public Dog(String name, String kinds, int weight) {
		super(name,kinds);
		this.weight = weight;
	}
	
	

	
	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
	}

	protected String getPLACE() {
		return PLACE;
	}


	protected int getWeight() {
		return weight;
	}

	protected void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
}
