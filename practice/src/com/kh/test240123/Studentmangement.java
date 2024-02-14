package com.kh.test240123;

import java.util.Scanner;

public class Studentmangement {
	Scanner sc;
	Student[] stArr;
	
	
	
	public Studentmangement() {
		super();
		this.sc = new Scanner(System.in);
		this.stArr = new Student[100];
	}
	
	
	public int printMenu() {
		System.out.println("==========성적관리 프로그램============");
		System.out.println("1. 성적입력");
		System.out.println("2. 모든학생 성적확인");
		System.out.println("3. 학생 성적 검색");
		System.out.println("4. 마지막 저장 정보 삭제");
		System.out.println("5. 조건 검색");
		System.out.println("9. 종료");
		System.out.println("menu를 입력하세요 : ");
		int select = sc.nextInt();
		sc.nextLine();
		return select;
	
	}
	
	public void startProgram() {
		int select=0;
		while(select!=9) {
			select = this.printMenu();
			
			switch(select) {
			case 1:
				this.insertGrade();
				break;
			case 2:
				this.printInfo();
				break;
			case 3:
				this.checkName();
			case 4:
				this.lastGradeDelete();
				break;
			case 5:
				printGradeByCondition();
				break;
			case 9:
				sc.close();
				return;
			}
			
			
		}
	}
	
	public void insertGrade() {
		System.out.println("======성적 입력======");
		String name;
		int math,kor,eng;
		
		System.out.println("이름 : ");
		name=sc.next();
		
		System.out.println("수학 점수 : ");
		math=sc.nextInt();
		
		System.out.println("국어 점수 : ");
		kor=sc.nextInt();
		
		System.out.println("영어 점수 : ");
		eng=sc.nextInt();
		
		int i = 0;
		boolean isTrue=false;
		while(stArr[i] !=null) {
			if(stArr[i++].getName().equals(name)) {
				System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
				isTrue=true;
				break;
				
			}
		}
		
		if(!isTrue) {
			stArr[i] = new Student(name,math,kor,eng,(math+kor+eng)/3);
			System.out.println("성적 저장 완료 : " +stArr[i++].toString());
		}

	}
	
	public void printInfo() {
		for(int i = 0;stArr[i] !=null;i++) {
			System.out.println(stArr[i].toString());
		}
		if(stArr[0]==null)
			System.out.println("입력된 성적이 없습니다.");
	}
	
	public void checkName() {
		System.out.println("검색할 이름을 입력해주세요 : ");
		String name = sc.next();
		int i = 0;
		boolean isTrue = false;
		while(stArr[i] !=null) {
			
			if(stArr[i].getName().equals(name)) {
				System.out.println("검색된 학생 정보"+stArr[i].toString());
				isTrue = true;
				break;
			}
		}
		i++;
		
		if(isTrue==false) {
			System.out.println("해당학생을 찾지 못했습니다.");
		}
	}
	
	
	public void lastGradeDelete() {
		if(stArr[0]==null) {
			System.out.println("삭제할 성적이 없습니다.");
			return;
		}
		for(int i =1; i<stArr.length;i++) {
			if(stArr[i]==null) {
				System.out.println(stArr[i-1]+"을 삭제하였습니다.");
				stArr[i-1]=null;
				break;
			}
		}
		
	}
	
	public void printGradeByCondition() {
		while(true) {
			int count = 0;
			
			System.out.println("기준점수 (이상) : ");
			int min = sc.nextInt();
			
			System.out.println("기준점수 (이하) : ");
			int max = sc.nextInt();
			
			System.out.println("1.평균  2.수학  3. 국어 4.영어");
			System.out.println("조회할 조건을 입력해주세요 : ");
			
			int n1 = sc.nextInt();
			if(n1>4) {
				System.out.println("잘못입력하셨습니다 .");
				break;
			}
			switch(n1) {
			case 1:
				for(int i = 0; stArr[i]!=null;i++) {
					if(stArr[i].getavg()>min && stArr[i].getavg()<max) {
						count++;
					}
				}
				System.out.println(min+"이상 "+max+"이하 학생 : "+count+ "명");
				break;
				
				
			case 2:
				for(int i = 0; stArr[i]!=null;i++) {
					if(stArr[i].getMath()>min && stArr[i].getMath()<max) {
						count++;
					}
				}
				System.out.println(min+"이상 "+max+"이하 학생 : "+count+ "명");
				break;
			case 3:
				for(int i = 0; stArr[i]!=null;i++) {
					if(stArr[i].getKor()>min && stArr[i].getKor()<max) {
						count++;
					}
				}
				System.out.println(min+"이상 "+max+"이하 학생 : "+count+ "명");
				break;
			case 4:
				for(int i = 0; stArr[i]!=null;i++) {
					if(stArr[i].getEng()>min && stArr[i].getEng()<max) {
						count++;
					}
				}
				System.out.println(min+"이상 "+max+"이하 학생 : "+count+ "명");
				break;
			default:
				break;
			}
	    }
	}
	
}
