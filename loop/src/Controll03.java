import java.util.Scanner;
public class Controll03 {

	public static void main(String[] args) {
		
		String id = "myId";
		String pwd = "myPassword";
		
		Scanner sc = new Scanner(System.in);
		
		String user="";
		String userpw="";
		
		System.out.println("아이디를 입력해주세요 : ");
		user = sc.nextLine();
		if(id.equals(user)) {
			System.out.println("비밀번호를 입력해주세요 : ");
			userpw = sc.nextLine();
			if(pwd.equals(userpw)) {
				System.out.println("로그인 성공");
			}
			else
				System.out.println("비밀번호가 틀렸습니다.");
		}
		else
			System.out.println("아이디가 틀렸습니다.");

	}

}
