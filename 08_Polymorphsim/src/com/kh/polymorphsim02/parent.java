package com.kh.polymorphsim02;

public class parent {
	private int x;
	private int y;
	
	public parent() {
		super();
	}

	public parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
		
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	@Override
	public String toString() {
		return "parent [x=" + x + ", y=" + y + "]";
	}

	public void printparent() {
		System.out.println("너는 부모객체야");
	}
	

}
