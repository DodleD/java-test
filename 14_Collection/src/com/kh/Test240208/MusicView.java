package com.kh.Test240208;

import java.util.Scanner;

import com.kh.Test240206.Book;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu(){
		while(true) {
			System.out.println("******** 메인 메뉴 ********");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			
			System.out.println("메뉴 번호 선택 : ");
			
			int index = sc.nextInt();
			sc.nextLine();
		
			switch(index) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료");
				return;
			default:
				break;
			}//end switch
		}//end while
	}
	
	public void addList() {
		System.out.println("******마지막 위치에 곡 추가 ******");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		Music m = new Music(title, singer);
		if(mc.addList(m)>0) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	
	public void addAtZero() {
		System.out.println("******첫 위치에 곡 추가******");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		Music m = new Music(title, singer);
		if(mc.addAtZero(m)>0) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	
	public void printAll() {
		System.out.println(mc.printAll());
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		
		if(mc.searchMusic(title)!=null) {
			System.out.println("검색한 곡명 : "+title);
			System.out.println(mc.searchMusic(title).getTitle() + " - " + mc.searchMusic(title).getSinger());
		}else {
			System.out.println("검색한 곡이 없습니다.");
		}
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		Music m = mc.searchMusic(title);
		if(mc.removeMusic(title)!=null) {
			System.out.println("삭제한 곡명 : "+title);
			System.out.println(m.getTitle()+ " - " + m.getSinger() + "를 삭제했습니다.");
		}else {
			System.out.println("삭제할 곡이 없습니다.");
		}
	}
	
	public void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.println("검색할 곡 명 : ");
		String title = sc.nextLine();
		
		System.out.println("수정할 곡 명 : ");
		String chtitle = sc.nextLine();
		
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();

		Music last = mc.searchMusic(title);
		Music m = new Music(chtitle,singer);
		if(mc.setMusic(title,m)!=null) {
			System.out.println(title+ " - " + last.getSinger() + "의 값이 변경되었습니다.");
		}else {
			System.out.println("수정할 곡이 없습니다.");
		}
	}
	
	public void ascTitle() {
		mc.ascTitle();
	}
	
	public void descSinger() {
		mc.descSinger();
	}
}
