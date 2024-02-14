import java.util.Scanner;

public class loop_03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("단을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		while(dan>9 || dan<1) {
			System.out.println("1 이상 9 이하의 숫자만 입력해주세요");
			dan = sc.nextInt();
		}
		
		for(int i = dan ; i<10 ; i++) {
			System.out.println("==="+i+"단"+"===");
			for(int j = 1 ; j<10 ; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			
		}
		
	}

}
