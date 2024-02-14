package com.kh.Ex02;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Student choi = new Student("최지원",15, 60, 70, 80);
//		Student kim = new Student("김도헌",17 ,95, 85, 80);
//		
//		
//		System.out.println(choi.getName()+"  나이 : "+choi.getAge()+"  수학점수 : "+choi.getMath()+"  영어점수 : "+choi.getEng()
//				+"  국어점수 : "+choi.getG());
//		
//		System.out.println(choi.getName()+"님의 평균은 "+choi.getEvg());
		
//		Student choi = new Student();
//		
//		System.out.print("이름 : ");
//		choi.setName(sc.next());
//		System.out.println("나이 : ");
//		choi.setAge(sc.nextInt());
//		System.out.println("수학점수 : ");
//		choi.setMath(sc.nextInt());
//		System.out.println("영어점수 : ");
//		choi.setEng(sc.nextInt());
//		System.out.println("국어점수 : ");
//		choi.setG(sc.nextInt());
//		
//		System.out.println(choi.getName()+"님의 평균은 "+choi.getEvg());
		
		University kh = new University("KH대학교",75,60,60);
		Student choi = new Student("최지원",15, 60, 70, 80);
		Student kim = new Student("김도헌",17 ,95, 85, 80);
		
		
		kh.isEvaluate(kim);
		
	}

}
