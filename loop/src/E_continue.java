import java.util.Scanner;

public class E_continue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i<101 ;i ++) {
			if (i%6==0)
				continue;
		sum+=i;
		
		System.out.println(sum);
		}
	}

}
