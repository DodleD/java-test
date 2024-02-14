package com.kh.Test240206;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		int index ;
		while(true) {
		System.out.println("== Welcome KH Library ==\n");
		
		System.out.println("****** 메인 메뉴 *******");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");		
		System.out.println("메뉴 번호를 선택해주세요 : ");
		index = sc.nextInt();
		sc.nextLine();
			switch(index) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					break;
			}//end switch
		
		}//end while
		
		
	}//end mainMenu
	
	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.println("도서 명 : ");
		String title = sc.nextLine();
		System.out.println("저자 명 : ");
		String author = sc.nextLine();
		System.out.println("장르(1. 인문 / 2.과학 / 3. 외국어 / 4. 기타");
		int category = sc.nextInt();
		String cate = "";
		switch(category) {
		case 1:
			cate = "인문";
			break;
		case 2:
			cate = "자연과학";
			break;
		case 3:
			cate = "의료";
			break;
		case 4:
			cate = "기타";
			break;
		}
		System.out.println("가격 : ");
		int price = sc.nextInt();
		
		Book book = new Book(title,author,cate,price);
		bc.insertBook(book);
	}
	
	public void selectList() {

		ArrayList<Book> bookList = new ArrayList<>();
		
		bookList.addAll(bc.selectList());
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}
		else {
			for(Book a : bookList) {
				System.out.println(a.toString());
			}
		}
		
		
	}
	
	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.println("검색 키워드 : ");
		String keyword = sc.next();
		ArrayList<Book> searchList = new ArrayList<>();
		searchList=bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			for(Book b : searchList) {
				System.out.println(b.toString());
			}
		}
	}
	
	public void deleteBook() {
		Book remove = new Book();
		System.out.println("===== 도서 삭제 =====");
		System.out.println("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자 명 : ");
		String author = sc.nextLine();
		
		remove = bc.deleteBook(title,author);
		
		if(remove==null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
			System.out.println(remove);
		}
		else
			System.out.println("성공적으로 삭제되었습니다.");
	}
	
	public void ascBook() {
		if(bc.ascBook()==1)
			System.out.println("정렬에 성공하였습니다.");
		else {
			System.out.println("정렬에 실패하였습니다.");
			System.out.println(bc.ascBook());
		}
	}
	
	
	
	
}
