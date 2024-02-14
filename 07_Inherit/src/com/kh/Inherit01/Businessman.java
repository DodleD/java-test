package com.kh.Inherit01;

public class Businessman extends Man{
	String company;
	String position;
	
	public Businessman(String company, String position, String name) {
		super(name); //부모 객체의 매개변수 있는 생성자를 호출하는 메소드이다.
		this.name=name;
		this.company=company;
		this.position=position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is "+ company);
		System.out.println("My posision is " + position);
		tellyourName();
		super.tellyourName(); //이렇게 부모의 메서드를 부를 수도 있다.
	}
}
