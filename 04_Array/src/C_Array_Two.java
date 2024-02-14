import java.util.Scanner;

public class C_Array_Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int b[][] = new int[3][3];
//		
//		for(int i = 0; i<b.length;i++) {
//			for(int j = 0; j<b.length;j++) {
//				b[i][j]=j;
//			}
//		}
//		for(int i = 0; i<b.length;i++) {
//			for(int j = 0; j<b[i].length;j++) {
//				System.out.print(b[i][j]+ " ");
//			}
//		}
		
		//===============2==================
		
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		for(int i = 0; i<a;i++) {
			arr[i]=i+1;
		}
		for(int i = 0; i<a;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
