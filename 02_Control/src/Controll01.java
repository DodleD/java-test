import java.util.Scanner;

public class Controll01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.println("메뉴번호를 입력하세요 : ");
		String a = sc.nextLine();
		
		switch(a) {
		
		case("1") :
			System.out.println("입력 메뉴입니다.");
			break;
		case("2") :
			System.out.println("수정 메뉴입니다.");
			break;
		case("3") :
			System.out.println("조회 메뉴입니다.");
			break;
		case("4") :
			System.out.println("삭제 메뉴입니다.");
			break;
		case("7") :
			System.out.println("종료 메뉴입니다.");
			break;
		default :
			System.out.println("잘못 누르셨습니다.");
		
		}
		

	}

}
