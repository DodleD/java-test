import java.util.*;
public class Operator05 {

	public static void main(String[] args) {
		// 논리연산자~
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("알파벳 하나 입력 : ");
//	
//		int n1 = sc.next().charAt(0);
//
//		System.out.println("사용자가 입력한 값이 대문자 입니다 : "+ (n1>=65 && n1<=90));
		
		System.out.println("남자면M 여자면 F를 입력해주세요 : ");
		
		char n1 =sc.next().charAt(0);
		
		System.out.println("사용자가 여자입니까 : " + (n1 =='f' || n1=='F'));
		// String은 객체이고 서로 비교를 하려면 .equrㅣs()를 사용해야 한다.
	}

}
