import java.util.Scanner;

public class Test240116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// 사칙연산 ====================================
//		System.out.println("사칙연산");
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//
//		System.out.println(num1+num2);
//		System.out.println(num1-num2);
//		System.out.println(num1*num2);
//		System.out.println(num1/num2);
//		//가위바위보 ====================================
//		System.out.println("가위바위보");
//		
//		int user1 = sc.nextInt();
//		int user2 = sc.nextInt();
//		//가위 1, 바위 2, 보 3
//		if((user1==1 && user2==3) || (user1==2 && user2==1) || (user1==3 && user2==2))
//			System.out.println("user1 승리");
//		else if(user1==user2)
//			System.out.println("비겼습니다");
//		else
//			System.out.println("user2 승리");
//		
//		//수 출력 ====================================
//		
//		for(int i = 15; i < 112; i++)
//			System.out.println(i);
//		
//		//숫자 입력받고 *2인 숫자 출력 유저가 0입력하면 멈춤
//		
//		
//		while(true){
//			int r = sc.nextInt();
//			System.out.println(r*2);
//			if(r==0)
//				break;
//		}
		
		//user3 가위바위보 정보 입력
		
		while(true) {
			int user3 = sc.nextInt();
			int com = (int)((Math.random()*3 +1));
			if((user3==1 && com==3) || (user3==2 && com==1) || (user3==3 && com==2))
				System.out.println("user3은 :"+user3+" com은 : "+com+"   user3 승리");
			else if(user3==com)
				System.out.println("비겼습니다");
			else
				System.out.println("user3은 :"+user3+" com은 : "+com+"   com 승리");
			if(user3==5)
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
