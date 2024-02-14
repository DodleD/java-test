package com.kh.test240124;

public class CircleController {
	Circle c = new Circle();
	public static final double pi = 3.14;
	
	public String calcArea(int x, int y, int radius) {

		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double area = pi*radius*radius;
		return "면적 : "+ c.toString() + ", " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum = pi*radius*2;
		return "면적 : "+ c.toString() + ", " + circum;
	}
}
