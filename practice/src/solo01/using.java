package solo01;

import java.util.Scanner;

public class using {
	Scanner sc = new Scanner(System.in);
	private userdata[] userArr = new userdata[100];
	private int menu;
	private int index = 0;
	private int money = 0;
	private int csell = 0;
	private int ssell = 0;
	private int hsell = 0;
	public void start() {
		
		while(true) {
			hello();
			switch(menu) {
			case 1:
				insert();
				break;
			case 2:
				leftOverDrink();
				break;
			case 3:
				sellDrink();
				break;
			case 4:
				money();
				break;
			case 5:
				deleteDrink();
				break;
			case 6:
				buyDrink();
				break;
			case 9:
				return;
			default:
				continue;

			}//end switch
			
			
		}//end while
		
		
	}//end start
	
	

	public int hello() {
		System.out.println("====================");
		System.out.println("자판기 관리 시스템입니다.");
		System.out.println("====================");
		System.out.println("원하시는 메뉴를 선택해주세요 : ");
		System.out.println("1. 음료등록");
		System.out.println("2. 등록된 음료, 남아있는 음료");
		System.out.println("3. 현재까지 팔린 음료");
		System.out.println("4. 현재 수입");
		System.out.println("5. 음료 삭제");
		System.out.println("6. 음료 구매");
		System.out.println("9. 종료");
		return menu = sc.nextInt();

		
		
	}//end hello
	
	public void insert() {
		System.out.println("음료등록 입니다. 등록할 음료 이름과 가격, 수량을 입력해주세요 : ");
		userArr[index]= new userdata(sc.next(),sc.nextInt(),sc.nextInt());
		
		System.out.println(userArr[index].toString()+"등록 완료됐습니다");
		index++;

	}//end insert
		
	public void leftOverDrink() {
		for(int i = 0; userArr[i]!=null; i++) {
			System.out.println(userArr[i].toString());
		}
	}//end leftOverDrink
	
	public void sellDrink() {
		if(csell==0 && ssell==0 && csell==0)
			System.out.println("판매된게 없습니다.");
		else {
			System.out.println(userArr[0].getName()+csell+"개 입니다.");
			System.out.println(userArr[1].getName()+ssell+"개 입니다.");
			System.out.println(userArr[2].getName()+hsell+"개 입니다.");
		}
		
	}//end sellDrink
	
	public void money() {
		System.out.println("현재 총 수입은 : "+money+"원 입니다.");
	}//end money
	
	public void deleteDrink() {
		for(int i = 0; userArr[i]!=null; i++) {
			System.out.println((i+1)+"."+userArr[i].toString());
		}
		System.out.println("중에 삭제하고싶은 드링크 번호를 골라주세요 : ");
		int select = sc.nextInt();
		System.out.println(userArr[select-1]+"가 삭제됐습니다.");
		userArr[select-1]=null;

	}//end deleteDrink

	public void buyDrink() {
		for(int i=0; userArr[i]!=null; i++) {
			System.out.println((i+1)+"."+userArr[i].getName());
		}
		System.out.println("어떤 음료를 구매하시겠습니까? : ");
		int t = sc.nextInt();
		int count = userArr[t-1].getQuantity();
		int afterCount = count-1;
		userArr[t-1].setQuantity(afterCount);
		
		if(userArr[t-1].getName().equals("콜라")) {
			csell++;
		}
		if(userArr[t-1].getName().equals("사이다")) {
			ssell++;
		}
		if(userArr[t-1].getName().equals("환타")) {
			hsell++;
		}
		
		money += userArr[t-1].getPrice();
		System.out.println("구매완료 되었습니다.");
		
	}
	

}//end class
