package com.kh.Test2402062;

import java.util.HashSet;
import java.util.Scanner;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========= KH 추첨 프로그램 ==========");
		
		while(true) {
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			int index = sc.nextInt();
			
			switch(index) {
			case 1:
				insertObject();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 9:
				return;
			}
			
			
		}
		
		
	}
	
	public void insertObject() {
		Lottery lt = new Lottery(); 
		System.out.println("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String name;
		String phone;
		for(int i =0; i<num; i++) {
			System.out.println("이름 : ");
			name = sc.nextLine();
			System.out.println("핸드폰 번호('-'빼고) : ");
			phone = sc.nextLine();
			
			lt= new Lottery(name,phone);
			
			if(!(lc.insertObject(lt))) {
				System.out.println("중복된 대상입니다. 다시 입력하세요");
				i--;
			}
		}//end for
		
		System.out.println(num+" 명 추가 완료되었습니다.");
		System.out.println(lc.lottery);
	}
	
	public void deleteObject() {
		
	}
	
	public void winObject() {
		
	}
	
	public void sortedWinObject() {
		
	}
	
	public void searchWinner() {
		
	}
	
	
}
