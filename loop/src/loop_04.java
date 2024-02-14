import java.util.Scanner;

public class loop_04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		while(true) {
			System.out.println("첫 번째 정수를 입력해주세요 : ");
			int n1= sc.nextInt();
			System.out.println("두 번째 정수를 입력해주세요 : ");
			int n2 = sc.nextInt();
			sc.nextLine();
			System.out.println("연산자를 입력해주세요.(exit를 입력하면 종료) ");
			String a = sc.next();
			
			if(a.equals("exit")) {
				System.out.println("프로그램을 종료합니다. ");
				return;
			}
			switch(a) {
			
			case("+") :{
				System.out.println(n1+"+"+n2+"="+(n1+n2));
				break;
				}
			case("-") :{
				System.out.println(n1+"-"+n2+"="+(n1-n2));
				break;
				}
			case("*") :{
				System.out.println(n1+"*"+n2+"="+(n1*n2));
				break;
				}
			case("/") :{
				if(n2==0) 
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요 : ");
				System.out.println(n1+"/"+n2+"="+(n1/n2));
				break;
				}
				
			case("%") :{
				System.out.println(n1+"%"+n2+"="+(n1%n2));
				break;
				}
			default :{
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;
				}	
			}
			
		}
			
	}
}

