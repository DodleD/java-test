import java.util.Scanner;

public class loop_02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n1, n2;
		System.out.println("두 개의 값을 입력해주세요 : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		while(n1<1) {
			System.out.println("1 이상의 숫자를 입력해주세요 : ");
			n1=sc.nextInt();	
		}
		while(n2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요 : ");
			n2=sc.nextInt();
		}
		for(int i = (n1<n2 ? n1 : n2); i<=(n1>n2 ? n1 : n2); i++) {

			System.out.print(i+" ");
		}
	
		

	}

}
