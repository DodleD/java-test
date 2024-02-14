import java.util.Scanner;

public class ControllAndLoop01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char start = 'y';
		
		while(true) {
			if(start=='y') {
				int count = 0;
				System.out.print("문자열을 입력해주세요 : " );
				String user = sc.next();
				
				System.out.println("검색할 문자을 입력해주세요 : ");
				char check = sc.next().charAt(0);
				
				for(int i = 0; i <user.length();i++) {
					if(user.charAt(i)==check) {
						count++;
					}
				}
				System.out.println(user+"안에 해당 문자는 "+count+"개 있습니다.");
				
				System.out.println("재시작 하시겠습니까?(y/n) : ");
				start = sc.next().charAt(0);
			}
			else if(start=='n')
				return;
			else {
				System.out.println("잘못입력하셨습니다. 재시작 하시겠습니까?(y/n) : ");
				start = sc.next().charAt(0);
			}
		
		}

	}

}
