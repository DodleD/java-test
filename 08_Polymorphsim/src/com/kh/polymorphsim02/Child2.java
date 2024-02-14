package com.kh.polymorphsim02;

public class Child2 extends Child1{
	private int n;

	
	
	
	public Child2() {
		
	}
	
	public Child2(int x, int y, int z, int n) {
		super(x,y,z);
		this.n = n;
	}

	@Override
	public String toString() {
		return "Child2 [n=" + n + "]";
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
	public void printchild2() {
		System.out.println("나는 2번 자식 객체야");
	}
	

}
