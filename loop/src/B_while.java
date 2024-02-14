import java.util.Scanner;
import java.math.*;
public class B_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		int rad =(int)(Math.random()*100+1);
//		int sum = 0;
//		int b = 1;
//		while(rad>b) {
//			sum+=b;
//			b++;
//			
//		} 
//		System.out.println(rad);
//		System.out.println(sum);
		
		String str = sc.nextLine();
		
		int a = str.length();
		
		for(int i = 0; i< a; i ++){
			
			if(i%2==0){
				System.out.println(str.charAt(i));
			}
		}
		
	}

}
