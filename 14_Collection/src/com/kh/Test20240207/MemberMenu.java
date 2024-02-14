package com.kh.Test20240207;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("============ KH 사이트 ============");
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 같은 이름 회원 찾기");
		System.out.println("9. 종료");
		
		int index;
		while(true) {
			System.out.println("메뉴 번호 입력 : ");
			index=sc.nextInt();
			sc.nextLine();
			
			switch(index) {
			case 1:
				joinMembership();
				break;
			case 2:
				login();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				return;
				default:
					System.out.println("잘못누르셨습니다.");
			}
			
			
			
		}
		
	}
	
	public void memberMenu() {
		System.out.println("******* 회원 메뉴 *******");
		System.out.println("1. 비밀번호 바꾸기");
		System.out.println("2. 이름 바꾸기");
		System.out.println("3. 로그아웃");
		while(true) {
			System.out.println("메뉴 번호 선택 : ");
			int index = sc.nextInt();
			sc.nextLine();
			switch(index) {
			case 1:
				changePassword();
				break;
			case 2:
				 changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				return;
				default:
					System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
					break;
			}
			
		}
		
		
		
	}
	
	public void joinMembership() {
		System.out.println("----회원가입 입니다----");
		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String password = sc.next();
		System.out.println("이름 : ");
		String name = sc.next();
		
		Member m = new Member(name,password);
		
		if(mc.joinMembership(id, m)) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		}
		else
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		
		
	}
	
	public void login() {
		while(true) {
			System.out.println("----로그인 메뉴입니다----");
			System.out.println("아이디 : ");
			String id = sc.next();
			System.out.println("비밀번호 : ");
			String password = sc.next();
			
			if(mc.login(id, password)!=null) {
				System.out.println(mc.login(id, password)+"님 환영합니다. ");
				
				return ;
			}else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시입력해주세요");
			}
		}
	}
	
	public void changePassword() {
		while(true) {
			System.out.println("----비밀번호 바꾸기 입니다.----");
			System.out.println("아이디 : ");
			String id = sc.next();
			System.out.println("비밀번호 : ");
			String password = sc.next();
			System.out.println("새로운 비밀번호를 입력해주세요 : ");
			String newpassword = sc.next();
			if(mc.changePassword(id, password, newpassword)) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				return;
			}else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
				
			}
		}
	}
	
	public void changeName() {
		while(true) {
		System.out.println("----이름 바꾸기 입니다.----");
		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String password = sc.next();
		String name = mc.login(id, password);
		
		System.out.println("현재 설정된 이름 : "+ name);
		System.out.println("변경할 이름 : ");
		String chName=sc.next();
		if(name!=null) {
			mc.changeName(id, chName);
			System.out.println("이름 변경에 성공하였습니다.");
			return;
		}else {
			System.out.println("이름 변경에 실패했습니다. 다시입력해주세요.");
		}
		}
		
	}
	
	public void sameName() {
		System.out.println("----같은 이름 검색입니다.----");
		System.out.println("이름 : ");
		String name = sc.next();
		TreeMap result = mc.sameName(name);
		
		if(result.isEmpty()) {
			System.out.println("비어있어");
		}
		else {
			for(Object entry : result.entrySet()) {
				Entry<String, String> en = (Entry)entry;
				System.out.println(en.getValue()+" - " + en.getKey());
			}
		}
	}
}
