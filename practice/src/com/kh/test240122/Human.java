package com.kh.test240122;

public class Human {
	String name;
	int money;
	static int count = 0;
	/*
	 * static 변수, 정적(고정메모리) 변수이다. 모두 공용으로 사용하고 stak 영역과
	 * heap 영역과 다른 static 영역을 독자적으로 가지고 있으며 클래스변수 라고도
	 * 불리는데 컴파일시에 메모리 할당이 이루어지기 때문에 클래스명.스태틱변수명으로
	 * 사용할 수 있다.
	 * 객체를 만들 때 이름이 달라도 참고한 클래스가 똑같다면 공유되는 변수다.
	 * 생성한 객체 = 인스턴스 이름
	 */
//	  static 메소드 정적변수와 동일하게 고정메모리를 할당하고 클래스 이름으로
//	  접근 가능하다. 다만 객체를 생성하지 않아도(new 생성자를 사용하지 않아도)
//	  사용 가능하지만 static 메소드 안에는 static 변수만 사용 가능하다.
//	  이유는 객체를 생성하지 않았기 때문에 일반변수는 사용 불가.
	 
	
	public Human(String name, int money) {
		this.money = money;
		this.name = name;
		this.count++;
	
	}
	
	//참조변수로 넘겨받은 곳에서는 set 해주면 안된다.
	public void buy(TV tv) {
		if(tv.getPrice() > this.money) {
			System.out.println("예산 초과입니다.");
			
		} else {
			System.out.println("구매가 가능합니다.");
		}
	}
	
	
}
