import java.util.Scanner;

public class code_up2 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		int call_number = sc.nextInt();
		
		int[] call = new int[call_number];
		
		for(int i = 0; i<call_number ; i++){
			call[i]= sc.nextInt();		
		}
		
		for(int i = call_number-1; i>=0; i--) {
			System.out.print(call[i]+" ");
		}

	}

}
