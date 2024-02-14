package com.kh.interface01;

import java.util.Scanner;

public class run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//다형성을 활용하여 Animal 타입의 배열을 만들어보자
		Animal[] animals = new Animal[5];
		//클래스가 생성되려면 생성자가 와서 클래스에 메모리 공간을 잡아야한다. (차이는 생성자)
		//위는 배열 생성
		
		
		for(int i = 0; i < animals.length;i++) {
			System.out.println("추가할 동물을 입력해주세요 : ");
			System.out.print("1.강아지 2.고양이");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				animals[i]=new Dog();
				break;
			case 2:
				animals[i]=new cat();
				break;
				
			}
		}
			for(int i = 0; i < animals.length;i++) {
				if(animals[i] instanceof Baby) {
					System.out.println("자고있습니다.");
				}else { 
					animals[i].makeSound();
				}
				
			}
			
			
		
		
		
	}
}
