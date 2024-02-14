import java.util.Scanner;
public class A_if02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		String type="";
		char a ;
//		System.out.println("나이(정수만) 입력해주세요");
		
//		age = sc.nextInt();
//		sc.nextLine();
		
//		if(age <=13)
//			type = "어린이";
//		else if(13<age && age<=19)
//			type = "청소년";
//		else
//			type = "성인";
//		
//		System.out.println(age+"세는 "+type+"에 속합니다.");
		
//		if(age <=13)
//			type = "어린이";
//		if(age>13 && age <=19)
//			type = "청소년";
//		if(age >19)
//			type = "성인";
//		
//		System.out.println(age+"세는 "+type+"에 속합니다.");
		
//		===========================================================
		
//		System.out.println("성별을 입력해주세요 (m(M) / f(F)) ");
//		
//		a=sc.next().charAt(0);
//		
//		
//		if(a=='m'||a=='M')
//			System.out.println("남학생입니다");
//		else if(a=='f'||a=='F')
//			System.out.println("여학생입니다");
//		else
//			System.out.println("잘못입력하셨습니다");
//		
		
		System.out.println("정수(양수를 입력해주세요)");
		
		age=sc.nextInt();
		
		if((age%2)==0 &&(age>0) )
			System.out.println("짝수 입니다.");
		else if((age%2)!=0 &&(age>0))
			System.out.println("홀수 입니다.");
		else
			System.out.println("양수가 아닙니다. 잘못입력하셨습니다.");
		
		
		
	}

}
