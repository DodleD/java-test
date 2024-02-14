package Movie;

import java.util.Scanner;

public class movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수 하나를 입력해주세요 : ");
//		int a = sc.nextInt();
//		
//		while(a<=4) {
//				System.out.println("다시 입력해주세요 : ");
//				a = sc.nextInt();
//			
//		}
//		for(int i = 1 ; i<=a ; i++) {
//			System.out.print(i + " ");
//		}
		
		//===================================================
		
//		System.out.println("배열의 길이를 입력해주세요 : ");
//		int[] n = new int[sc.nextInt()];
//		
//		for(int i = 0 ; i < n.length ; i++) {
//			n[i]=i;
//		}
//		System.out.print("배열 안에 들어간 수는 : ");
//		for(int j = 0 ; j< n.length ; j++) {
//			
//			System.out.print(n[j]+ " ");
//		}
		
		//====================================================
		
		//메뉴 개수만큼 배열 생성
		String[] arr = new String[6] ;

		int count = 0; //메뉴중에 몇 개를 골랐나 체크하기 위한 변수
		int priceSum=0; //메뉴의 총합을 구하기 위한 변수
		//예약확인
		System.out.println("영화관에 오신걸 환영합니다.");
		System.out.println("예약 확인 입니다.");
		System.out.println("이름 번호(-제외) 나이를 입력해주세요 : ");
		
		login cs = new login(sc.next(),sc.next(),sc.next());
		cs.copy(); //Q1 : 이 방법보다 편한게 있나요?
		cs.checkInfo();//copy로 배열에 값을 넣은 걸 원래 데이터값과 비교
		sc.nextLine(); //엔터 오류방지
		

		//메뉴 선택
		
		System.out.println("메뉴를 주문하시겠습니까? (예/아니오)");
		Menu go = new Menu(sc.nextLine());
		//메뉴 개수만큼 배열에 넣는 것을 반복하다가 0이 입력되면 탈출
		//Q2 : 자꾸 0이 출력되는 걸 막기위해 -1을 했는데 이것보다 더 나은 방법이 있나요?
		for(int i = 0 ; i<arr.length ; i++) { 
			arr[i]=sc.next();
			count++;
			if(arr[i].equals("0")) {
				break;
				}
		}
		go.setPick(arr);
		
		System.out.print("주문하신 메뉴는 : ");
		
		//출력문, 자꾸 0이 출력되서 count에 -1해버림
		for(int i = 0; i < count-1 ; i++) { 
			System.out.print("("+go.getPick()[i] + " "+go.getPrice()[i]+"원)");
			}
		
		//선택한 물품들의 총 가격을 구하는 것, 여기도 0이 출력되서 count-1 해버림
		for(int j =0; j < count-1; j++) {
			priceSum+=go.getPrice()[j];
		}
		System.out.println();
		System.out.print("총 가격은 : "+priceSum+"원 입니다, 주문하시겠습니까? (예/아니오)");
		
		
		//마지막 주문완료 print메소드 주문대기표를 랜덤하게 발행하게 함
		go.print(sc.next());
		
		
		
		
		//Q3 계속해서 만들다 보니까 어디까지 메소드로 넣어버려야 하는지 좀 헷갈립니다.
		//클래스에는 고객정보 저장하고 get과 set으로만 메소드를 놓고 main문에서 작성해도 되는건가요?
		//아니면 그냥 하다가 본인의 감각이 생겨서 괜찮아질까요?
		
		
	}

}
