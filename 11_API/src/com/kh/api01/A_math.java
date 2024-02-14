package com.kh.api01;

public class A_math {
	public void mathod01() {
		//java.lang.math
		
		//상수필드
		System.out.println("파이 : " + Math.PI);
		
		//절대값을 알고자 할 때
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		//올림 : ceil
		double num2 = 4.349;
		System.out.println("올림 : " + Math.ceil(num2));
		
		//반올림 : round
		System.out.println("반올림 : "+ Math.round(num2));
		
		//버림 : floor
		System.out.println("버림 : " + Math.floor(num2));
		
		//가장 가까운 정수값을 알아낸 후 실수값을 반환하는 rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2));
		
		//제곱근 (루트) : sqrt
		System.out.println("4의 제곱근 : "	 + Math.sqrt(4));
		
		//제곱 : pow
		System.out.println("2의 10제곱 : " + Math.pow(2 , 10));
		
		/*
		 * math의 특징 : 모든 필드와 메소드가 static이다.
		 * 필드의 변수들은 모두 final(상수)이다.
		 * 생성자가 private이다. (값을 못바꾸게 일부러)
		 * 한번만 메모리에 올려놓고 재사용하는 개념 -> 싱글톤 패턴
		 */
	}
}
