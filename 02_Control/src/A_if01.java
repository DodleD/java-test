import java.util.Scanner;
public class A_if01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//		int n = sc.nextInt();
//		sc.nextLine();
//		System.out.println("정수 : ");
//		
//		if(n>0) {
//			System.out.println("양수");
//		}
//		
//		if(n<0) {
//			System.out.println("음수");
//		}
		//=========================================================
		
//		int n = sc.nextInt();
//		sc.nextLine();
//		System.out.println("정수 : ");
//		
//		if(n>0) {
//			System.out.println("양수이다");
//		}
//		else {
//			System.out.println("음수이다");
//		}
		
		//=================================
		System.out.println("정수 : ");
		int n = sc.nextInt();
		
		
		
		if(n>0) {
			System.out.println("양수");
		}
		else if(n==0) {
			System.out.println("제로");
		}
		else {
			System.out.println("음수");
		}
	}

}
