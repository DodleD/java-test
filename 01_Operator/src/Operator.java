import java.util.Scanner;
public class Operator {

	public static void main(String[] args) {
		// 두 수를 입력받아 어떤 숫자가 더 큰지를 출력하는 프로그램
		// 첫 번째 숫자가 더 큽니다 : true/false
		//  첫 번째 정수는 짝수입니다 : true/false
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2 = 0;
		
		System.out.println("숫자 두 개를 입력해 주세요");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("첫 번째 정수 : " + n1);
		System.out.println("두 번째 정수 : " + n2);
		System.out.println("첫 번째가 두 번째보다 큽니다 : " + (n1>n2));
		System.out.println("첫 번째 정수는 짝수입니다 : " + (n1%2==0));
		
	}

}
