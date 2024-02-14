import java.util.Scanner;

public class code_up_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		int[] arr = new int[a];
//		int r = 0;
//		for(int i = 0 ; i<arr.length; i++) {
//			arr[i]=sc.nextInt();
//		}
//		r=arr[0];
//			for(int j = 0; j<arr.length; j++) {
//				r=r<arr[j] ? r : arr[j];
//
//			}
//		
//		System.out.println(r);
//		
// 		
		
		int[][]	arr = new int[19][19];
		int n = sc.nextInt();
		for(int i = 0 ; i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j= 0; i<arr.length; i++) {
				if(arr[i][j]!=0) {
					System.out.print("1"+ " ");
				}
				else
					System.out.println("0" + " ");
			}
			System.out.println();
		}
		

	}

}
