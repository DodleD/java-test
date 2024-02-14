import java.util.Scanner;

public class A_Array03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int[] a = new int[10];
//		int rad=0;
//		
//		for(int i = 0 ; i<10 ; i++) {
//			rad=(int)(Math.random()*100+1);
//			a[i]+=rad;
//			
//			System.out.println(a[i]);
//		}
		//==========================================
		
//		System.out.println("배열의 길이를 입력해주세요 : ");
//		int n1 = sc.nextInt();
//		sc.nextLine();
//		String[] arr =new String[n1];
//		
//		for(int i = 0 ; i<arr.length ; i++) {
//			System.out.println((i+1)+"번째 "+" 과일명을 입력해주세요 ");
//			arr[i] = sc.nextLine();
//			
//				
//		}
//		for(int i = 0 ; i<arr.length ; i++) {
//			System.out.println((i+1)+"번째 "+arr[i]);
//			
//		} 
		
		//=======================================
						
//		char[] crr ;
//		
//		System.out.println("문자열 한 개 입력해주세요");
//	
//		String a = sc.nextLine();
//		int b = a.length();
//		
//		crr = new char[b];
//		
//		for(int i = 0 ; i <a.length() ; i++) {
//			crr[i] = a.charAt(i);			
//		}
//		for(int i = 0 ; i<a.length() ; i++) {
//			System.out.println(crr[i]);
//		}

		
		//=========================================
		
		System.out.println("배열의 길이를 입력해주세요 : ");
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		System.out.println(a);
		int sum = 0;
		for(int i = 0; i<arr.length ; i++) {
			arr[i]=(int)(Math.random()*100+1);	
		}
		for(int i = 0; i<arr.length ; i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
			System.out.println(i+"번 째 배열 값 "+arr[i]);
		}
		System.out.println("sum 값 : "+sum);
		
	}

}


