import java.util.Scanner;

public class ControllAndLoop02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름을 입력해주세요 : ");
		String userName = sc.next();
		int winCount=0;
		int loseCount=0;
		int sameCount=0;
		sc.nextLine();
		while(true) {
	
			System.out.println("가위바위보 : ");
			String user = sc.next();

			if(user.equals("가위")||user.equals("바위")||user.equals("보")) {
				
				//배열 생성해서 편하게 해도.됨
				/*
				 * String[] arr = {"가위","바위","보"};
				 * comrandom=arr[(int)(math.random*3+1)]
				 * 하면 코드를 줄일 수 있다.
				 */
				int com=(int)(Math.random()*3+1);
				String comrandom = "";
				if(com==1)
					comrandom="가위";
				else if(com==2)
					comrandom="바위";
				else
					comrandom="보";
				
				
				
				System.out.println(userName+" : "+user);
				System.out.println("컴퓨터"+" : "+comrandom);
				
				if(user.equals("가위")&&comrandom.equals("보")||
					user.equals("보")&&comrandom.equals("바위")||
					user.equals("바위")&&comrandom.equals("가위")) {
					System.out.println("이겼습니다!");
					winCount++;
				}
				else if(user.equals(comrandom)) {
					System.out.println("비겼습니다.");
					sameCount++;
				}
				else {
					System.out.println("졌습니다 ㅠㅠ");
					loseCount++;
				}
			}
			else if(user.equals("exit")) {
				int result = winCount+loseCount+sameCount;
				System.out.println(result+"전 " +winCount+"승 "+sameCount+"무 "+loseCount+"패");
				break;
			}
			else
				System.out.println("잘못입력하셨습니다.");
			
		}
		
		
	}

}
