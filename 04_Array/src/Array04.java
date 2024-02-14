import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String[] arr = {"일","월","화","수","목","금","토",};
//		
//		while(true) {
//			System.out.println("0~6까지 숫자를 입력해주세요 : ");
//			int a = sc.nextInt();
//			
//			if(a<7 && a>=0) {
//				for(int i = 0 ; i<arr.length;i++) {
//					if(a==i) {
//						System.out.println(arr[i]+"요일 입니다.");
//					}
//					
//				}
//			}
//			else
//				System.out.println("다시 입력해주세요 : ");
//			
//		}
		//=========================================
		
//		System.out.println("정수 : ");
//		int total = 0;
//		int a = sc.nextInt();
//		int[] arr = new int[a];
//		
//		for(int i = 0; i<a; i++) {
//			System.out.println("배열"+i+"번 째 인덱스에 넣을 값 : ");
//			arr[i]=sc.nextInt();
//			total+=arr[i];
//			
//		}
//		for(int i = 0; i<a; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("\n"+"총 합 : "+total);
		
//		int n1 = 0;
//
//		System.out.println("3 이상인 홀수 자연수를 입력해주세요 : ");
//		
//		n1=sc.nextInt();
//		int[] arr = new int[n1];
//		while(n1%2==0) {
//			System.out.println("다시 입력해주세요");
//			n1=sc.nextInt();
//			arr = new int[n1];
//		
//		}
//		int sumer= 1;
//		
//			for(int i = 0; i<arr.length;i++) {
//				
//				
//				if(i<n1/2) {
//					arr[i]+=sumer;
//					sumer++;
//				}
//				else if(i==n1/2) {
//					arr[i]=sumer;
//					sumer--;
//				}
//				else if(i>n1/2) {
//					arr[i]=sumer;
//					sumer--;
//				}
//			}
//		
//		
//		for(int j = 0; j<arr.length; j++ ) {
//			System.out.print(arr[j]+", ");
//		}
		
		String[] str = {"교촌","양념","후라이드"};
		boolean isTrue=false;
		
			System.out.println("치킨 이름을 입력하세요 : ");
			String user = sc.next();
			for(int i = 0; i<str.length;i++) {
				if(str[i].equals(user)) {
					isTrue=true;		
					break;
				}
			}
			if(isTrue)
				System.out.println(user+"치킨 배달 가능");
			else
				System.out.println(user+"치킨은 없는 메뉴입니다.");

	}

}
