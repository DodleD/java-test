package com.kh.test240123;

public class Student {
	private String name;
	private int math;
	private int eng;
	private int kor;
	private int avg;
	public Student(String name,int math, int eng, int kor,int avg) {
		this.name=name;
		this.math=math;
		this.eng=eng;
		this.kor=kor;
		this.avg=avg;
		
	}

	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return " [name=" + name + ", math=" + math + ", eng=" + eng + ", kor=" + kor + "]";
	}









	public int getMath() {
		return this.math;
	}
	public int getEng() {
		return this.eng;
	}
	public int getKor() {
		return this.kor;
	}
	public int getavg() {
		return this.avg;
	}
	public String getName() {
		return this.name;
	}
	
	
	public void setMath(int math) {
		this.math=math;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
}
