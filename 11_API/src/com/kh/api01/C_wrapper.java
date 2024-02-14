package com.kh.api01;

public class C_wrapper {
	
		/*
		 * Wrapper 클래스 
		 * 기본 자료형을 객체로 포장해줄 수 있는 클래스가 래퍼클래스이다.
		 * 
		 *       기본 자료형 <----------> Wrapper 클래스
		 *       
		 *       boolean               Boolean
		 *       char                  Charactor
		 *       byte                  Byte
		 *       short                 Short
		 *       int                   Integer
		 *       long                  Long
		 *       float                 Float
		 *       double                Double
		 *       
		 * 기본자료형을 객체로 표현해야할 경우
		 *     ->메소드 호출해야될 때
		 *       메소드의 매개변수로 기본 자료형이 아닌 객체 타입만 요구될 때
		 *       다형성을 적용시키고 싶을 때도 객체로 표현
		 */
		
	public void mathod01() {
		//Boxing : 기본자료형 ->Wrapper클래스 자료형
		int num1 = 14;
		int num2 = 15;
		
		//System.out.println(num1.equals(num2));
		
		Integer i1 = new Integer(num1); //num1을 i1으로 박싱
		Integer i2 = new Integer(num2); //num2도 마찬가지
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); //두 값을 비교해서 앞쪽이 크면 1반환, 뒤쪽이크면 -1 같으면 0 반환
	
		//2. 객체따위 생성하지않고 곧바로 대입하는 방법(Auto Boxing)
		Integer i3 = num1;
		System.out.println(i3);
		
		
		Integer i4 = new Integer(123); //생성자로 string을 넘기면 int형으로 되돌아온다.
		System.out.println(i4);
	
		//unBoxing : Wrapper 클래스 자료형 -> 기본 자료형
		//1. 해당 그 Wrapper클래스에서 제공하는 xxxvalue() 메소드를 통해서 가능
		int num3 = i3.intValue();
		int num4 = i4.intValue();
		
		System.out.println(num3);
		System.out.println(num4);
	
		//Auto unBoxing : 메소드를 사용하지 않고 바로대입하는 방법
		int num5 = i1;
		
		System.out.println("===========");
		
		//기본자료형 < -- > String
		String str1 = "10";
		String str2 = "15.5";
		
		System.out.println(str1 +str2);	
		
		//1.기본자료형
		//	"10" -> 10
		//  "15.5" -> 15.5
		//  Wrapper클라스.prasexxx() 사용
		int i = Integer.parseInt(str1);
		double b = Double.parseDouble(str2);
	   System.out.println(i + b);
	   //2
	   //기본자료형 ->String
	   //10 -> "10"
		String str3 = String.valueOf(i);
		String str4 = String.valueOf(b);
		
	
	
	
	
	
	
	
	
	
	
	}
}
