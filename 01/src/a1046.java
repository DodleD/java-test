import java.util.Scanner;
public class a1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c = 0;
		
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		int sum=a+b+c;
		float avg =(float)(a+b+c)/3;
		
		System.out.println(sum);
		System.out.printf("%.1f",avg);
	}

}
