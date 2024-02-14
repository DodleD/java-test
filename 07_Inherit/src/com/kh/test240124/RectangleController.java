package com.kh.test240124;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width){
	
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
//		r = new Rectangle(x,y,height,width);
		//두번 째 방법. 생성자로 초기화 해버려
		
		int Area = height * width;
		return "면적 : " + r.toString() + "/" + Area;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
	
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		int Perimeter = 2*(height + width);
		return "둘레 : " + r.toString() + "/" + Perimeter;
	}
	
}
