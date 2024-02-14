package com.kh.Test240125;

import java.util.Scanner;

public class LibraryMenu {
	Scanner sc;
	LibraryController lc; //밑에서 생성자로 초기화 해라 ~

	
	public void mainMenu() {
		sc = new Scanner(System.in);
		lc = new LibraryController();
		
		System.err.println("이름을 입력해주세요 : ");
		String name = sc.next();
		System.err.println("나이을 입력해주세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력해주세요 : ");
		char gender = sc.next().charAt(0); //소문자만 받고싶으면 toLowerCase();
		//대문자만 받고 싶으면 toUpperCase(); 쓰면 된다.
		
		Member mem = new Member(name,age,gender);
		lc.insertMember(mem);
		
		
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				lc.myInfo();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			}
		
		}//end while
	}//end mainMenu
	
	public void selectAll() {
		Book[] bList = new Book[5];
		bList = lc.selectAll();
		for(int i = 0; i<bList.length;i++) {
			System.out.println(i+"번 도서"+bList[i].toString());
		}//end for
	}//end selectAll
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.next();
		
		lc.searchBook(keyword);
		for(int i = 0; i<lc.searchBook(keyword).length;i++)
			if(lc.searchBook(keyword)[i]!=null)
				System.out.println(lc.searchBook(keyword)[i]);
		
	}//end searchBook
	
	public void rentBook(){
		
		for(int i = 0; i<lc.bList.length;i++)
			System.out.println(i+"번 "+lc.bList[i]);
		
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		int result = lc.rentBook(index);
		
		if(result == 0)
			System.out.println("성공적으로 대여되었습니다.");
		else if(result ==1)
			System.out.println("나이 제한으로 대여 불가능입니다.");
		else if(result ==2)
			System.out.println("성공적으로 대여되었습니다. 요리원 쿠폰이"
					+ "발급되었으니 마이페이지에서 확인하세요.");
		else
			System.out.println("오류입니다.");
	}//end rentBook
	
	
}//end LibraryMenu
