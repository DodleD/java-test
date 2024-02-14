import java.util.Scanner;
public class Operator06 {
	public static void main(String[] args) {
		
		/*
		 * 3항 연산자
		 * 
		 * 조건식 ? 참일경우 불러올 결과 값 : 조건식이 거짓일 경우 불러울 결과 값
		 * 조건식은 T/F둘 중 하나여야한다.
		 * 주로 비교,논리 연산자로 작성한다.
		 */
//		System.out.println("정수 값 입력 : ");
//		
	Scanner sc = new Scanner(System.in);
//		
//		int n1 = sc.nextInt();
//		
//		int result = (n1 % 2);
//		
//		System.out.println(result==0 ? "짝수 입니다" : "홀수 입니다." );
		
		System.out.println("첫 번째 정수 : ");
		int n1 = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int n2 = sc.nextInt();
		
		System.out.println("연산자 입력(+ 또는 -) : ");
		
		int s1 = sc.next().charAt(0);
		
		System.out.println((s1==43 || s1==45) ? (s1==43 ? n1+n2 : n1-n2) : "잘못입력했습니다.");
		
		
		
	}
}
