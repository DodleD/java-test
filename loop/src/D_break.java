import java.util.Scanner;
public class D_break {

	public static void main(String[] args) {
		//반복문 탈출 break; 사용.
		Scanner sc = new Scanner(System.in);
		String e = "exit";
		
		while(true) {
			String str = sc.nextLine();
			int a = str.length();
			
			if(str.equals(e)) 
				break;
			System.out.println("문자열의 길이는 : "+ a);
			
		}
		
		
		
	}

}
