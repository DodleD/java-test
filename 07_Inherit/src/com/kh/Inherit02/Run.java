package com.kh.Inherit02;
/*
 * 중복된 이름이나 겹치는게 있다면 부모클래스로 만들어서 관리해줄 수 있다.
 * 코드를 공통으로 만들어서 사용하기 때문에 코드의 추가나 변경이 용이하다.
 * 
 * 특징 : 클래스간에 상속에 대해서는 다중상속이 불가능하다.(부모는 한명)
 * 부모클래스에서 정의되어있는 protected 필드는 자식클래스에서 사용이 가능하다.
 * 자식객체는 부모클래스에 있는 메소드를 마치 내것 처럼 사용이 가능하다
 * 부모클래스에 정의된 기능이 마음에 들지 않는다면 내 맘대로 수정할 수 있다.(오버라이딩)
 * 명시되어 있지는 않지만 모든 클래스(자바에서 제공하는 클래스, 직접만든 클래스)는 object클래스의 후손이다
 * ->object클래스의 메소드도 마음대로 호출 가능하다. *오버라이딩으로 변경사용도 가능하다.
 * 
 * 
 */
public class Run {

	public static void main(String[] args) {
		TV t = new TV("엘지", "t-01", "엄청얇티",3500,65);
		Desktop d = new Desktop("엄청고사양", "d-01", "좋다",3000,true);
		SmartPhone s = new SmartPhone("S24", "s-01", "접는다", 8000,"SKT");
		
		System.out.println(t.information());
		System.err.println(d.information());
		System.out.println(s.information());
		

	}

}
