package com.kh.Test240205;

public class Human {
	String name;
	int age;
	
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	
	
}
