import java.util.Scanner;

public class Controll04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String oner="관리자";
		String member="회원";
		String nonmember="비회원";
		
		String user = "";
		
		System.out.println("권한을 확인하고자 하는 등급 : ");
		user = sc.nextLine();
//		if(oner.equals(user)) {
//			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//		}
//		else if(member.equals(user)) {
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//		}
//		else if(nonmember.equals(user)) {
//			System.out.println("게시글 작성");
//		}
//		else
//			System.out.println("잘못입력하셨습니다");
		
		switch(user) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원" :
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원" :
			System.out.println("게시글 작성");
			break;
		default :
			System.out.println("잘못입력하셨습니다");
		}
		 
		
		
	}

}
