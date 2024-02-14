import java.util.Scanner;
public class B_switch01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		String menu ="";
		
//		System.out.println("정수(1~3) 입력해주세요");
//		a=sc.nextInt();
//		
//		switch(a) {
//		
//		case 1:
//			System.out.println("빨간색 입니다.");
//			break;
//		case 2:
//			System.out.println("파란색 입니다.");
//			break;
//		case 3:
//			System.out.println("노란색 입니다.");
//			break;
//		default:
//			System.out.println("잘못입력하셨습니다.");
//		}
		
		//=======================================================
		
		
//		System.out.println("구매하고자하는 과일(사과, 바나나, 딸기) 입력 : ");
//		
//		menu = sc.nextLine();
//		switch(menu) {
//		
//		case("사과"):
//			System.out.println(menu+" 의 가격은 1000원 입니다.");
//			break;
//		case("바나나"):
//			System.out.println(menu+" 의 가격은 2000원 입니다.");
//			break;
//		case("딸기"):
//			System.out.println(menu+" 의 가격은 3000원 입니다.");
//			break;
//		default:
//			System.out.println("잘못입력하셨습니다.");
//		}
		
//		int mouth, day;
//		System.out.println("월을 입력하세요 : ");
//		mouth=sc.nextInt();
//		
//		switch(mouth) {
//		
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			day = 31;
//			break;
//		case 4:
//		case 6:
//		case 9:	
//		case 11:
//			day = 30;
//			break;
//		case 2:
//			day = 28;
//			break;
//		default :
//			day = 0;
//			System.out.println("정신똑디");
//			return;
//		
//		}
//		
//		
//		System.out.println(mouth+"월은"+day+"일 까지 입니다.");
		
//		System.out.println("문자 : ");
//		
//		char y;
//		
//		y=sc.next().charAt(0);
//		System.out.println(y+"의 유니코드 : "+(int)y);
//		
//		Double g, e, m;
//		
//		System.out.println("국어 : ");
//		g = sc.nextDouble();
//		System.out.println("영어 : ");
//		e = sc.nextDouble();
//		System.out.println("수학 : ");
//		m = sc.nextDouble();
//		
//		
//		System.out.println("총점 : "+(int)(g+e+m));
//		System.out.println("평균 : "+(int)(g+e+m)/3);
//		
		int n1 = 10;
		int n2 = 4;
		
		float fn=3.0f;
		
		double dn = 2.5;
		
		char ch = 'A';
		
		System.out.println(n1/n2);
		System.out.println(n1%n2);
		
		System.out.println(n2*dn);
		System.out.println((double)n1);
		
		System.out.println (dn);
		System.out.println((double)(n1)/(double)(n2));
		
		System.out.println((int)fn);
		System.out.println((int)(n1/fn));
		
		System.out.println((float)n1/fn);
		System.out.println((n2*dn)/fn);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)ch+n1) ;
		System.out.println((char)((int)ch+n1));
		
		
		
	}

}
