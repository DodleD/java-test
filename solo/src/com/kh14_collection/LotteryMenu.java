package com.kh14_collection;

import java.util.Iterator;
import java.util.Scanner;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("======== KH 추첨 프로그램 ========");
		int index = 0;
		while(true) {
			System.out.println("******* 메인 메뉴 ********");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			
			System.out.println("메뉴 번호 입력 : ");
			index=sc.nextInt();
			sc.nextLine();
			switch(index) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
				default:
					break;
			}
			
		}
	}
	
	public void insertObject() {
		
		String name;
		String phone;
		Lottery lt = new Lottery();
		System.out.println("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<num; i++) {
			System.out.println("이름 : ");
			name = sc.next();
			System.out.println("핸드폰 번호('-'빼고) : ");
			phone = sc.next();
			lt = new Lottery(name, phone);
			if(lc.insertObject(lt)) { //true라면 실행(정상적으로 값이 들어가면 true 반환)
				
			}else { //false = 값이 제대로 들어가지 않았다면
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
			
		}//end for
		
		System.out.println(num + "추가 완료되었습니다.");
	}
	
	public void deleteObject() {
		Lottery lt = new Lottery();
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		lt = new Lottery(name,phone);
		
		if(lc.deleteObject(lt)&&lc.winObject().contains(lt)) {
			if(lc.winObject().remove(lt)) {
				lc.lottery.remove(lt); 
				lc.winObject(); 
			}
			System.out.println("삭제 완료되었습니다.");
		}else
			System.out.println("존재하지 않는 대상입니다.");
		
		
		
	}
	
	public void winObject() {
		System.out.println(lc.winObject());
		
	}
	
	public void sortedWinObject() {
		Iterator iter = lc.sortedWinObject().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()); 
		}
		//lc에서 받아온 TreeSet객체를 Iterator를 통해 출력
	}
	
	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		Lottery lt = new Lottery(name, phone);
		
		if(lc.searchWinner(lt)) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
		
	}
	
}
