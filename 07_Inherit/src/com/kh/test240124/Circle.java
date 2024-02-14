package com.kh.test240124;

public class Circle extends Point{
	private int radius = 0;

	public Circle() {
	
		
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	
	
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + radius;
	}

	
	
}