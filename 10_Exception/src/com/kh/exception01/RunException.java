package com.kh.exception01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RunException {
	Scanner sc = new Scanner(System.in);
	/*
	 * RuntimeException
	 * - 프로그램 실행시 발생되는 예외들
	 * 
	 * *RuntimeException의 후손들
	 * -IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근시 발생되는 예외
	 * -NullPointerException : 참조변수가 null로 초기화된 상태에서 해당 참조변수에 특정 변수나
	 * 메소드로 접근을 시도하면 생기는 에러
	 * -ClassCastException : 허용할 수 없는 형변환이 진행될때 발생되는 예외
	 * -ArthmeticException : 나누기 연산시 0으로 나눌 때 나오는 예외
	 * -NegativeArraySizeException : 배열의 크기를 음수로 넣으면 발생되는 예외
	 * ->RuntimeException 관련된 예외는 충분히 예측가능한 상황이 있다.
	 */
	
	public void method01() {
		int n1,n2;
		
		System.out.println("정수1 : ");
		n1 = sc.nextInt();
		System.out.println("정수2 : ");
		n2 = sc.nextInt();

		try {
			System.out.println("나누기 결과 : "+n1/n2); //
		} catch(ArithmeticException e) {
			System.out.println("0으로는 못나눠");
			e.printStackTrace(); //강제로 오류난 이력을 보고자 하면 쓴다
		}
		
			System.out.println("프로그램 종료");

	}
	
	public void method02() {
		int s = sc.nextInt();
		
		int[] arr = new int[s];
		
		try {
		System.out.println("100번 째 인덱스 값 : " + arr[100]);
		} catch(IndexOutOfBoundsException i) { //catch를 두 번 사용한 모습.
			System.out.println("부적절한 인덱스로 접근했습니다.");
		} catch(NegativeArraySizeException n) {
			System.out.println("음수로 배열의 크기를 지정할 수 없습니다.");
		}
		
		System.out.println("프로그램을 종료합니다");
		
		
	}
	
	public void method03() throws IOException{ //예외처리 떠넘기기
		/*
		 * CheckedException : 반드시 예외처리를 해야하는 예외들
		 * 조건문을 미리 제시할 수 없음( 예측이 불가한 곳에서 문제가 발생하기 때문에 예외처리가 필수다.
		 * 외부 매개체와 입출력이 일어날 때 발생된다.
		 * ex) Scanner, InputStreamReader
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int a = Integer.parseInt(br.readLine()); //int 형 출력
		double b= Double.parseDouble(br.readLine());
		System.out.println(str);
		System.out.println(a+b);
	}
	
	public void method04() throws IOException{
		method05(); //05에서 발생된 에러가 호출한 곳으로 넘어왔다.
	}
	
	public void method05() throws IOException{
		method06(); //06에서 발생된 에러가 호출한 곳으로 넘어왔다.
	}

	public void method06() throws IOException{
		throw new IOException();
	}
	
}//end class
