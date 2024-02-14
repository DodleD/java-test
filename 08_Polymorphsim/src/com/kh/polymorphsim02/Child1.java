package com.kh.polymorphsim02;

public class Child1 extends parent{
	private int z;
	
	

	public Child1() {
		super();
	}

	public Child1(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "Child1 [z=" + z + "]";
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void printchild1() {
		System.out.println("너는 1번 자식 객체야");
	}
	
	
}
