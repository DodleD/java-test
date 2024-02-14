package com.kh.test240122;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		int n1 = 0;
//		
//		System.out.println("2~9까지의 숫자를 입력하세요 : ");
//		n1 = sc.nextInt();
//		while(n1>9 ||n1<2) {
//			System.out.println("잘못입력했습니다. 다시 입력해주세요 : ");
//			n1 = sc.nextInt();
//		}
//
//		for(int i = 2; i <= n1 ; i++) {
//			for(int j = 1; j< 10 ; j ++) {
//				if(i%2==0)
//					System.out.println(i+"*"+j+"= "+i*j);
//			}
//			System.out.println("==============");
//		}
		
		//====================================================
		
//		System.out.println("배열을 크기를 입력해주세요 : ");
//		
//		int n1 = sc.nextInt();
//		int[] arr = new int[n1];
//		int sum = 0;
//		
//		for(int i = 0; i<arr.length; i++) {
//			arr[i]=(int)(Math.random()*100 +1);
//			if(arr[i]%2!=0) {
//				sum += arr[i];
//				System.out.println(i+"번 째 랜덤 수는 : "+arr[i]);
//			}
//		}
//		System.out.println("모든 홀수들의 합은 : "+sum);
//		
//		TV myTV = new TV("삼성", 2020, 65, 10);
//		myTV.show();
//		Human one = new Human("김도헌",200);
//		
//		one.buy(myTV);
//		
//		Human choi = new Human("최지원",15000);
//		
//		System.out.println(Human.count);
//		
//		Human kim = new Human("최지원",15000);
//		
//		System.out.println(Human.count);
//		
		
		/*
		 * 객체 배열
		 * 객체를 저장하는 배열로 일반적인 배열과 다르게
		 * 배열의 각 요소가 객체로 이루어져 있으며 만들고 메모리공간을
		 * 할당해야함.
		 * Human[] arr = new Human[5];
		 */
//		Human[] arr = new Human[5];
//		
//		for(int i = 0; i<arr.length;i++) {
//			
//			arr[i]=new Human("김도헌",i+100);
//		}
//		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i].getName()+" "+arr[i].getAge() );
//		}
//
//		Human[] arr2 = {new Human("rrr",100)};
//		//이렇게 선언 및 초기화해도 된다.
		
		
		//============================================
		
//		Book[] bookArr=new Book[100];
//
//		int count =0;
//		int menu = 0;
//		
//		while(true) {
//			int number;
//			String name,genre,author;
//			System.out.println("======도서관리 프로그램======");
//			System.out.println("1. 도서등록");
//			System.out.println("2. 도서목록출력");
//			System.out.println("3. 도서검색입니다.");
//			System.out.println("9. 종료");
//			System.out.println("메뉴 선택()");
//			menu = sc.nextInt();
//			switch(menu){
//			
//			case 1:{
//				System.out.println("제목을 입력해주세요 : ");
//				name=sc.next();
//				
//				System.out.println("장르를 입력해주세요  : ");
//				genre = sc.next();
//				
//				System.out.println("저자를 입력해주세요 : ");
//				author = sc.next();
//				
//				System.out.println("책 번호를 입력해주세요 : ");
//				number = sc.nextInt();
//				bookArr[count] = new Book(name,genre,author,number);
//				System.out.println("도서 등록 완료 : "+ bookArr[count++].toString());
//				
//				break;
//			}
//			case 2:{
//				for(int i = 0; i<bookArr.length;i++) {
//					if(bookArr[i]==null)
//						break;
//					System.out.println("========등록된 도서정보=======");
//					System.out.println(bookArr[i].toString());
//					}
//					break;
//			}
//			case 3:{
//				System.out.println("====도서 검색====");
//				System.out.println("검색할 도서 제목 : ");
//				String title = sc.next();
//				
//				Book target=null;
//				
//				for(int i = 0; i<bookArr.length;i++) {
//					if(bookArr[i]==null)
//						break;
//					else if(bookArr[i].getBookName().equals(title)) {
//						target = bookArr[i];
//						break;
//						}
//					}
//					if(target == null) {
//						System.out.println("동일한 제목의 도서가 없습니다 .");
//						
//					}else {
//						System.out.println("검색 도서 정보 : " + target.toString());
//					} break;
//				}
//				
//			case 9:
//				return;
//			}
//			
//
//		}
		
		Book[] userBook = new Book[5];
		
		userBook[0] = new Book("김도헌","asdf","agdf",10);
		System.out.println(userBook[0].toString());
		
		
		

	}

}
