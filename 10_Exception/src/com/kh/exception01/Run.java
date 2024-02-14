package com.kh.exception01;

import java.io.IOException;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) throws IOException{
		/*
		 * 에러 종류
		 * 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 -> 소스코드로 해결이 안됨 -> 심각한 오류
		 * 컴파일 에러 : 소스코드 문법상의 오류 -> 빨간줄로 애초에 오류로 알려준다 -> 발견과 해결이 쉽다
		 * 런타임 에러 : 코드상으로 문제가 없는데 프로그램 실행 중에 발생하는 에러(시스템 오류나 개발자가 예측 가능
		 * 하지만 처리를 안해놓은 에러)
		 * 논리 에러 : 문법적으로도 문제 없고 실행할 때도 문제가 없다. 프로그램 의도와는 맞지않은 동작이나 결과가 나타나는 에러
		 * 
		 * 예외처리 할 것들은 컴파일 에러, 런타임 에러, 논리 에러 같은 개발자가 예측하여 수정할 수 있는
		 * 에러들을 가지고 작업함 -> 이런 것들을 예외라고 함 -> Exception
		 * 
		 * 예외처리를 하는 목적 : 예외처리를 하지 않고 예외가 발생되는 경우 프로그램이 비정상적인 종료가 된다
		 * 
		 * 예외 처리 방법.
		 * 1. try - catch 문
		 * 2.throws를 이용해서 에러를 위임한다.
		 * 
		 */
		RunException r = new RunException();
		
		r.method03();
		
		try {
			r.method04();
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		//finally try-catch의 결과와 상관없이 try-catch의 모든 과정이 끝났을 때 무조건 실행하는 구문
		finally {
			sc.close();
		}
		
		
	}
	

}
