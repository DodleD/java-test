import java.util.Scanner;
public class code_up {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] call = new int[23];
		int call_number = sc.nextInt();
		for(int i = 0; i < call_number; i++) {
			call[sc.nextInt() - 1]++;
		}
		for(int i = 0; i <call.length; i++) {
			System.out.print(call[i]+" ");
		}

	}

}
