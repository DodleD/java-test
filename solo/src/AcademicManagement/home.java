package AcademicManagement;
import java.util.Scanner;

public class home {
	Student student = new Student();
	professor pf = new professor();
	master m;
	Scanner sc = new Scanner(System.in);
	int menu ;
	String nameInfo="";
	
	public void startMenu() {
		student.studentInfoSet();//로그인할 때 비교할 값을 넣어놓은 초기화메소드
		pf.proSet();
		while(true) {
			System.out.println("로그인 하실 번호를 입력해주세요 : ");
			System.out.println("1. 학생");
			System.out.println("2. 교수");
			System.out.println("3. 관리자");
			
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1: //학생으로 로그인
				System.out.println("학생 로그인 입니다. \n성함과 비밀번호를 입력해주세요 : ");
				nameInfo = sc.next(); //이름을 저장해놔야 여러가지 애들중에서 찾기 가능
				
				if(student.login(nameInfo, sc.next())) {
					studentMenu(); //학생 메뉴로 이동	
				}
				else {
					System.out.println("이름 또는 비밀번호가 틀립니다. 다시 시도해주세요.");
				}
				break;
			case 2: //교수로 로그인
				System.out.println("교수 로그인 입니다. \n성함과 비밀번호를 입력해주세요 : ");
				nameInfo = sc.next();
				
				if(pf.login(nameInfo, sc.next())) {
					professorMenu(); //교수 메뉴로 이동
				}
				break;
			case 3: //관리자로 로그인
				
				
				
				break;
			default:
				break;
			}//end switch
		}//end while
	}//end startMenu
	
	public void studentMenu() {
		System.out.println("학생 메뉴입니다 원하는 메뉴의 번호를 입력해주세요 : ");
		
		while(true) {
			System.out.println("1. 학생정보조회");
			System.out.println("2. 비밀번호변경");
			System.out.println("3. 이전단계로");
			int index = sc.nextInt();
			switch(index) {
			case 1:
				student.InfoCheck(nameInfo);
				break;
			case 2:
				System.out.println("개인정보 보호를 위해 비밀번호를 한 번 더 입력해주세요 : ");
				if(student.passwordCheck(sc.next())) {
					sc.nextLine();
					System.out.println("변경하실 비밀번호를 입력해주세요 : ");
					student.passwordChange(sc.nextLine());
				}
				System.out.println("정상적으로 변경되었습니다.");
				System.out.println("변경된 비밀번호는 : " + student.getPassword()+" 입니다");
				break;
			case 3:
				return ;	
			}
		}
	}//end studentMenu
	
	public void professorMenu() {
		System.out.println("교수 메뉴입니다 원하는 메뉴의 번호를 입력해주세요 : ");
		
		while(true) {
			System.out.println("1. 교수정보조회");
			System.out.println("2. 비밀번호변경");
			System.out.println("3. 소속학생조회");
			System.out.println("4. 이전단계로");
			int index = sc.nextInt();
			switch(index) {
			case 1:
				pf.InfoCheck(nameInfo);
				break;
			case 2:
				System.out.println("개인정보 보호를 위해 비밀번호를 한 번 더 입력해주세요 : ");
				if(student.passwordCheck(sc.next())) {
					sc.nextLine();
					System.out.println("변경하실 비밀번호를 입력해주세요 : ");
					student.passwordChange(sc.nextLine());
				}
				System.out.println("정상적으로 변경되었습니다.");
				System.out.println("변경된 비밀번호는 : " + student.getPassword()+" 입니다");
				break;
			case 3:
				for(int i =0; i<student.st.length; i++) {
					System.out.println(student.st[i].toString()); //출력을 제한하고싶은데 교수에서 그걸 할 수 있을까
				}
				break;
			case 4:
				return;
			}
		}
	}
	

}//end class
