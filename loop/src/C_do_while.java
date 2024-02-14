import java.util.Scanner;
import java.math.*;
public class C_do_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum=0;
		int i = 1;
		do {
			sum+=i;
			i++;
		}while(a!=i);
		System.out.println(a);
		System.out.println(sum);
	}

}
