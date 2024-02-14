import java.util.Scanner;

public class Test240119 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("나이를 입력해주세요");
//		int userage = sc.nextInt();
//		agecheck(userage);
//		System.out.println("정수 입력 : ");
		//===================================
		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		
//		adder(num1, num2);

		//===================================
		
//		hole(num1, num2);
//		
//		//===================================
		
//		int[] g = new int[num1];
//		
//		for(int i = 0; i<num1; i++) {
//			g[i]=sc.nextInt();
//		}
//		for(int i = num1-1; i>=0; i--) {
//			System.out.print(g[i] + " ");
//		}
		
		//====================================
		
		int a = sc.nextInt();
		
		char[][] arr = new char[a][];
		
		for(int i = 0; i<arr.length ; i++) {		
			System.out.println(i+"행의 열 크기 : ");
			int b = sc.nextInt();
			arr[i] = new char[b];
		}
		char n = 'a';
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = n++;
			}
		}
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
	
			}
			System.out.println();
		}
			
		
		
	}
	
	
	
	
	
	public static void agecheck(int age) {	
		if(age<7)
			System.out.println("어린이");
		else if(age<19)
			System.out.println("청소년");
		else
			System.out.println("성인");
		return;
	}
	
	public static void adder(int num1, int num2) {
		int sum = 0;
		if(num1>num2) {
			for(int i = num2; i<num1; i++) {
				if(i%3==0) {
					sum+=i;
				}
			}
			System.out.println("두 수사이의 3의 배수 합은 : "+sum);
		}
		else {
			for(int i = num1; i<num2; i++) {
				if(i%3==0) {
					sum+=i;
				}
			}
			System.out.println("두 수사이의 3의 배수 합은 : "+sum);
		}
	}
	
	public static void hole(int num1, int num2) {
		int asum = 0;
		int bsum = 0;
		if(num1>num2) {
			for(int i = num2; i<num1; i++) {
				if(i%2==0) {
					asum+=i;
				}
				else
					bsum+=i;
			}
			System.out.println("모든 짝수의 합 : "+asum+ "모든 홀수의 합 : "+bsum);
		}
		else {
			for(int i = num1; i<num2; i++) {
				if(i%2==0) {
					asum+=i;
				}
				else
					bsum+=i;
			}
			System.out.println("모든 짝수의 합 : "+asum+ "모든 홀수의 합 : "+bsum);
		}
	}
	

	
	
	
}
