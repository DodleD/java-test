import java.util.Scanner;
public class c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2=0;
		int select=0;
		
		
		
		
		do {
			System.out.println("계산기 입니다.");
			System.out.println("첫 번째 수 : ");
			n1=sc.nextInt();
			
			System.out.println("두 번째 수 : ");
			n2=sc.nextInt();
			
			System.out.println("연산자를 입력해주세요.");
			char y = sc.next().charAt(0);
			
			if(y=='+') 
				System.out.println(n1+"+"+n2+"="+ (n1+n2));			
			else if(y=='-')
				System.out.println(n1+"-"+n2+"="+ (n1-n2));
			else if(y=='*')
				System.out.println(n1+"*"+n2+"="+ (n1*n2));
			else if(y=='/')
				System.out.println(n1+"/"+n2+"="+ (n1/n2));
			else if(y=='%')
				System.out.println(n1+"%"+n2+"="+ (n1%n2));
			else if(y=='m') {
				int result = 0;
				System.out.println("미적분을 선택하셨습니다. 첫 번째 숫자는 숫자부분 두 번째 숫자는 지수 부분 입니다.");
				System.out.println("현재 수는 "+n1+"^"+n2+"입니다. 몇 번 미분할 지 입력해주세요");
				int m = sc.nextInt();
				for(int i=m ; i>=1 ; i--) { //2, 1, 0
					result = (n1*n2); //6, 12, 12
					n1=result;
					n2--; //2, 1 , 0
					System.out.println(result+"^"+n2); //2^3
					
					
				} for(int j = n2; n2>=1 ; n2--) {
					
					result*=result;
					System.out.println(result);
				}
					
				
			}
				
			
		}while(select==0);
	

	}

}
