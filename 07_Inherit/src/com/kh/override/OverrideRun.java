package com.kh.override;

public class OverrideRun {

	public static void main(String[] args) {
		
		Book b = new Book("hoho","honggildong");
		System.out.println(b); //우리가 몰랐지만 참조변수만 호출하면 알아서 toString()사용하여 불러주는 거였다.
		//오버라이딩 전에는 Object에 써있는 toString 이 나온다. 주소값 @ + 16진수
		//우리가 book에서 override를 재정의해서 주소가 아닌 값이 나온다.
		/*
		 * 오버라이딩 성립 조건
		 * 부모메소드명과 동일
		 * 매개변수 개수, 자료형, 순서 동일(매개변수명은 상관없음)
		 * 부모메소드의 반황형 동일
		 * 부모네소드의 접근제한자보다 범위가 같거나 커야한다.
		 * 
		 * 
		 * @override붙이는 이유
		 * 부모의 메소드 명이나 매개변수가 변경될 경우 찾아보기 쉽다
		 * 메소드가 오버라이딩 된 메소드라는 사실을 표시하기때문에 찾기 쉽다.
		 */
		

	}

}
