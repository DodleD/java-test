import java.util.Scanner;

public class codeup {

	public static void main(String[] args) {
		String[] array = {"b1","b2","b3","b4"};
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int order = 0;
		
		System.out.println("명령 번호를  입력해주세요. : ");
		String str = sc.nextLine();
		
		System.out.println("도서명 추가 입니다.");
		
		if(str.charAt(order)=='1') {
			System.out.println("도서명을 입력해주세요 : ");
			String book = sc.nextLine();
		}
		else if(order==2) {
			
			
		}
		else if(order==0) {
			
		}
		else
			System.out.println("wrong command!");

	}

}
