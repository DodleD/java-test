package com.kh.test240124;

public class Point {
	public static final double pi = 3.14;
	private int x = 0;
	private int y = 0;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	//get, set
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
		return x+ ", " + y;
	}
	
	
	
	
}
