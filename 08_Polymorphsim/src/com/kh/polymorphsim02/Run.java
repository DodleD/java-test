package com.kh.polymorphsim02;

public class Run {

	public static void main(String[] args) {
		
//		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
//		parent p1 = new parent();
		
//		p1.printparent();
//		
//		System.out.println("2.자식타입 레퍼런스로 자식객체를 다루는 경우");
//		Child1 c1 = new Child1();
//		
//		c1.printchild1();
//		c1.printparent();
		//((parent)c1.).printparent;
		//c1참조변수로 접근시 parent와 child1 둘 다 접근 가능하다.
		//자동형변환, 업캐스팅
		
		
		
//		System.out.println("3. 부모타입 레퍼럿런스로 자식객체를 다루는 경우");
//		parent p2 = /*(parent)*/ new Child1();
//		
//		p2.printparent();
//		((Child1)p2).printchild1();
		//위에 요소가 다운 캐스딩. 을 통하여 강제형변환 하고 사용 가능
		
		/*
		 * 1.업캐스팅
		 * 	 자식 타입->부모타입   =   자동 형변환이 이루어진다.
		 *   ex)자식.부모메소드();
		 * 	  부모 = 자식객체;
		 * 
		 * 2.다운캐스팅
		 *   부모타입->자식타입으로 형변환. 명시해줘야한다.
		 *   ex)((자식메소드객체)부모참조변수).메소드이름
		 */
		
//		parent p3 = new Child2();
//		
//		p3.printparent();
//		((Child2)p3).printchild1();
//		((Child2)p3).printchild2();
		
		/*
		 * 부모타입으로 파생된 여러가지 타입의 자식 객체를 부모클래스 타입 하나로 다룰 수 있는 기술
		 * 
		 * 다형성을 쓰는 목적(장점)
		 * 
		 * 다형성 사용 전
		 * child1 객체 2개와 child2 객체 2개를 관리해야한다.
		 */
		
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,3);
		arr1[1] = new Child1(4,5,6);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(1,2,3,4);
		arr2[1] = new Child2(4,5,6,4);
		
		//====다형성 적용=====
		
		parent[] arr = new parent[4];
		arr[0] = new Child1(1,2,3);
		arr[1] = new Child1(4,5,6);
		arr[2] = new Child2(1,2,3,4);
		arr[3] = new Child2(4,5,6,7);
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printchild1();
			}
			else
				((Child2)arr[i]).printchild2();
		}
		
		
		
	}

}
