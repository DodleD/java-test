import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String str = sc.next();
		char[] arr = new char[str.length()];
		int count = 0;
		
		for(int i = 0; i<str.length();i++) {
			arr[i]=str.charAt(i);
		}
		
		System.out.println("문자 하나를 입력해주세요 : ");
		char user = sc.next().charAt(0);
		
		for(int i = 0; i<str.length();i++) {
			if(user==arr[i]) {
				count++;
				System.out.print(i+"번 째에 있습니다.");
			}
	
		} System.out.println();
		System.out.println("총"+count+"개 있습니다.");

	}

}
