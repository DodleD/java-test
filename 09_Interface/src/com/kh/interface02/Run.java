package com.kh.interface02;

public class Run {

	public static void main(String[] args) {
		/*
		 * 인터페이스 = 추상메소드 + 상수필드들이 모여서 만들어진 클래스.
		 * 추상메소드 = 동작하는 구분이 구현되어있지 않은 메소드.
		 * 추상메소드로 이루어져있기 때문에 객체를 생성할 수 없다.
		 * 참조변수로는 사용이 가능하다.
		 * 
		 * 인터페이스 안에 추상메소드는 구현부가 없기때문에 클래스에서 implements를 하게되면
		 * 무조껀 @override로 인터페이스안에 있는 추상메소드들을 구현부를 만들어줘야 에러가 나지
		 * 않음.
		 */
			
		Shape[] shapes = new Shape[2];
		
		shapes[0] = new Circle(5);
		shapes[1] = new Rectangle(3,4);
		/*
		 * 배열 또는 컬렉션에서 사용
		 * 처음부터 끝까지 무조건 모두 탐색
		 * 해당배열에 인덱스 값이 하나씩 왼쪽에 있는 값이 대입되어 반복문 진행
		 */
		int[] arr = {1,2,3,4,5};
		for(int num : arr)
		
		//참조변수를 하나 만드는 것, 객체는 생성되지 않음
		for(Shape shape : shapes) {
			System.out.println("도형의 넓이 : "+shape.calculateArea());
		}
		for(int i =0; i<shapes.length;i++) {
			Shape shape = shapes[i];
			System.out.println("도형의 넓이 : "+shape.calculateArea());
		}
		
		
		
	}

}
