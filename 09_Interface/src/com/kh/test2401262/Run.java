package com.kh.test2401262;

public class Run {
/*
 * 추상 클래스
 *  - 미완성된 클래스
 *  - 객체생성이 불가(단, 레퍼런스 변수는 가능)
 *  - 일반필드 + 일반메소드(+추상메소드)
 *  추상메소드를 가진 클래스는 반드시 추상 클래스로 명시해야함.
 *  
 *  
 *  추상 메소드가 굳이 없어도 추상클래스를 사용할 수 있을까 ? 된다.
 *  개념적 : 단지 이 클래스가 미완성된 클래스다 라는 걸 알리기 위해.
 *  프로그래밍적: 객체 생성이 불가 하게끔 할 때.
 *  
 *  추상메소드가 있는 추상클래스를 사용하는 이유
 *    - 부모클래스에 추상메소드가 존재할 경우
 *    자식 클래스에서는 강제로 오버라이딩해서 동일한 패턴의 메소드를 가지게 된다.
 *    -> 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면
 *    할 때 
 */
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		
		a[0]=new Dog("HHHH","EEEE", 28);
		a[1]=new Cat("caca","coco","cece","white");
		a[2]=new Dog("DDDD","AAAA",25);
		a[3]=new Cat("papa","popo","pepe","black");
		a[4]=new Cat("oaoa","OWOW","oeoe","yellow");
		
		
		//밑에 방법에 다른 방법
		for(Animal animal : a) {
			animal.speak();
		}
		
		
//		for(int i = 0; i <a.length; i++) {
//			a[i].speak();
//		}

	}

}
