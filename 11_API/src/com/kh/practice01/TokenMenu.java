package com.kh.practice01;

import java.util.Scanner;

public class TokenMenu {
	int menu = 0;
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
					break;
			}//end switch
		}//end while
	}//end mainMenu
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		String a = tc.afterToken(str);
		System.out.println("토큰 처리 전 글자 : " + a);
		System.out.println("토큰 처리 전 개수 : " + a.length());
		System.out.println("모두 대문자로 변환 : "+ a.toUpperCase());
		
	}
	
	public void inputMenu() {
		System.out.println("문자열을 입력하세요 : ");
		String str= tc.firstCap(sc.next());
		System.out.println(str); 
		System.out.println("찾을 문자를 하나 입력하세요 : ");
		System.out.println("i 문자가 들어간 개수 : "+tc.findChar(str, sc.next().charAt(0)));
	}
	
}

