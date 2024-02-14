package com.kh.Test240125;

public class Member {
	private String name;
	private int age;
	private int couponCount = 0;
	private char gender;
	
	public Member() {
		super();
	}

	public Member(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return name+" : [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount= " + couponCount+"]";
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

	protected int getCouponCount() {
		return couponCount;
	}

	protected void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	protected char getGender() {
		return gender;
	}

	protected void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
	
}
