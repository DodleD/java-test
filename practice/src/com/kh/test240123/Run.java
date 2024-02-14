package com.kh.test240123;

public class Run {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
//		double math,eng,kor,avg;
//		
//		System.out.println("수학 점수를 입력해주세요 : ");
//		math = sc.nextDouble();
//		
//		System.out.println("영어 점수를 입력해주세요 : ");
//		eng = sc.nextDouble();
//		
//		System.out.println("국어 점수를 입력해주세요 : ");
//		kor = sc.nextDouble();
//		
//		avg = (math+eng+kor)/3;
		
		
		//==============================================
		
//		Student[] info = new Student[100];
//		while(true) {
//			int menu = 0;
//			int count = 0;
//			
//			System.out.println("==========성적관리 프로그램============");
//			System.out.println("1. 성적입력");
//			System.out.println("2. 모든학생 성적확인");
//			System.out.println("3. 학생 성적 검색");
//			System.out.println("9. 종료");
//			menu = sc.nextInt();
//		
//			switch(menu){
//			
//			case 1:{
//				System.out.println("이름, 수학, 국어, 영어를 입력해주세요 : ");
//				String name = sc.next();
//				double math = sc.nextDouble();
//				double kor = sc.nextDouble();
//				double eng = sc.nextDouble();
//				info[count]= new Student(name,math,kor,eng);
//				sc.nextLine();
//				System.out.println(name+info[count++].toString()+"등록완료");
//				if(count!=0) {
//					for(int i = 0; i < info.length; i++) {
//						if(info[count]==(null))
//							break;
//						if(info[i].getName().equals(name)) {
//							System.out.println("중복된 이름입니다 다시 입력해주세요 : ");
//							name=sc.next();
//						}
//					}
//				}
//				
//				break;
//			}
//			case 2:{
//				for(int i = 0; i < info.length; i++) {
//					
//					if(info[i]==(null))
//						break;
//					else
//						System.out.println(info[i].toString());
//				}
//				break;
//			}
//			case 3:{
//				System.out.println("검색할 이름을 입력해주세요 : ");
//				String username = sc.next();
//				
//				for(int i = 0; i < info.length; i++) {
//					if(info[i]==(null))
//						break;
//					else if(info[i].getName().equals(username)) {
//						System.out.println(info[i].toString());
//						break;
//					}
//					else
//						System.out.println("학생 이름이 없습니다.");
//					
//				}
//				break;
//			}
//			case 9:
//				return;	
//
//			}
//				
//		}
//		
//		Student[] stArr = new Student[100];
//		int select;
//		int index=0;
//		while(true) {
//			System.out.println("==========성적관리 프로그램============");
//			System.out.println("1. 성적입력");
//			System.out.println("2. 모든학생 성적확인");
//			System.out.println("3. 학생 성적 검색");
//			System.out.println("9. 종료");
//			System.out.println("menu를 입력하세요 : ");
//			select = sc.nextInt();
//			
//			switch(select) {
//			case 1:{
//				System.out.println("======성적 입력======");
//				String name;
//				int math,kor,eng;
//				
//				System.out.println("이름 : ");
//				name=sc.next();
//				
//				System.out.println("수학 점수 : ");
//				math=sc.nextInt();
//				
//				System.out.println("국어 점수 : ");
//				kor=sc.nextInt();
//				
//				System.out.println("영어 점수 : ");
//				eng=sc.nextInt();
//				
//				int i = 0;
//				boolean isTrue=false;
//				while(stArr[i] !=null) {
//					if(stArr[i++].getName().equals(name)) {
//						System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
//						isTrue=true;
//						break;
//						
//					}
//				}
//				
//				if(!isTrue) {
//					stArr[index] = new Student(name,math,kor,eng);
//					System.out.println("성적 저장 완료 : " +stArr[index++].toString());
//				}
//			}break;
//				
//				
//			case 2:{
//				for(int i = 0;stArr[i] !=null;i++) {
//					System.out.println(stArr[i].toString());
//				}
//			}break;
//				
//				
//			case 3:{
//				System.out.println("검색할 이름을 입력해주세요 : ");
//				String name = sc.next();
//				int i = 0;
//				boolean isTrue = false;
//				while(stArr[i] !=null) {
//					
//					if(stArr[i].getName().equals(name)) {
//						System.out.println("검색된 학생 정보"+stArr[i].toString());
//						isTrue = true;
//						break;
//					}
//				}
//				i++;
//				
//				if(isTrue==false) {
//					System.out.println("해당학생을 찾지 못했습니다.");
//				}
//				
//			}break;
//				
//				
//			case 9:
//				return;
//				
//			}
//		}
//		

		
		
		Studentmangement st = new Studentmangement();	
		st.startProgram();
		
//		new Studentmangement().startProgram(); //이런 방법도 있다.
			
			
			
			
		
		
		
	}

}
