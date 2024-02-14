package com.kh.Ex02;

public class Student {
	//필드영역
	private String name;
	private int age;
	private int math;
	private int eng;
	private int g;
	
	//생성자는 기본적으로 public이다.
	public Student(String name, int age, int math, int eng, int g) {
		this.name=name;
		this.age=age;
		this.math=math;
		this.eng=eng;
		this.g=g;
	}
	public Student() {
		
	}
	
	
	//메소드 영역
	//get 영역
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public int getG() {
		return this.g;
	}
	// set 영역
	
	public void setName(String name) {
		this.name= name;
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	public void setMath(int math) {
		this.math=math;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public void setG(int g) {
		this.g=g;
	}
	
	public int getEvg() {
		int evg = (this.math+this.eng+this.g)/3;
		return evg;
	}
	
	
	
	
	
	
}
