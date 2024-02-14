package com.kh.test240124;

import java.util.Scanner;

public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				return;
			default:
				System.out.println("다시 입력해주세요 : ");
				menu =sc.nextInt();
				break;
			}//end switch 
		}//end while
	}//end mainMenu
	
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		default:
			return;
		}
	}
	
	public void rectangleMenu() {
		System.out.println("===== 사각형 둘레 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 9:
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		default:
			return;
		}
		
	}
	
	public void calcCircum() {
		System.out.println("x 좌표 : ");
		System.out.println("y 좌표 : ");
		System.out.println("반지름 : ");
		int x = sc.nextInt();
		int y= sc.nextInt();
		int rad = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, rad)); 
		
	}
	
	public void calcCircleArea() {
		System.out.println("x 좌표 : ");
		System.out.println("y 좌표 : ");
		System.out.println("반지름 : ");
		int x = sc.nextInt();
		int y= sc.nextInt();
		int rad = sc.nextInt();
		System.out.println(cc.calcArea(x, y, rad)); 
		
	}
	
	public void calcPerimeter() {
		System.out.println("x 좌표 : ");
		System.out.println("y 좌표 : ");
		System.out.println("높이 : ");
		System.out.println("넓이 : ");
		int x = sc.nextInt();
		int y= sc.nextInt();
		int height = sc.nextInt();
		int width = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, height, width));
		
	}
	
	public void calcRectArea() {
		System.out.println("x 좌표 : ");
		System.out.println("y 좌표 : ");
		System.out.println("높이 : ");
		System.out.println("넓이 : ");
		int x = sc.nextInt();
		int y= sc.nextInt();
		int height = sc.nextInt();
		int width = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, height, width));
	}
	
	
	
}
