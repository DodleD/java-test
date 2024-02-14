package Collection_generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		
		
		while(true) {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 직원메뉴");
		System.out.println("2. 손님메뉴");
		System.out.println("9. 종료");
		System.out.println();
		System.out.println("메뉴 번호 입력 : ");
		int index=sc.nextInt();
		sc.nextLine();
			switch(index) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					break;
			}
		
		}
		
	}
	
	public void adminMenu() {
		while(true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println();
			System.out.println("메뉴 번호 선택 : ");
			
			int index = sc.nextInt();
			sc.nextLine();
			
			switch(index) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				return;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요 : ");
					break;
				
			}//end switch
		}//end while	
	}
	
	public void customerMenu() {
		while(true) {
		System.out.println("현재 KH마트 농산물 수량");
		printFarm();
		
		System.out.println("******** 고객 메뉴 ********");
		System.out.println("1. 농산물 사기");
		System.out.println("2. 농산물 빼기");
		System.out.println("3. 구입한 농산물 보기");
		System.out.println("9. 메인으로 돌아가기");
		
		int index = sc.nextInt();
		sc.nextLine();
			switch(index) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요 : ");
				break;
			}//end switch
			
			
		}//end while
	}
	
	public void addNewKind() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("추가할 종류 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("수량 : ");
		int amount =sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
			Fruit fruit = new Fruit("과일",name);
			if(fc.addNewKind(fruit, amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
				
			}
			else
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			break;
		case 2:
			Vegetable vegetable = new Vegetable("채소",name);
			if(fc.addNewKind(vegetable, amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
			}
			else
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			break;
		case 3:
			Nut nut = new Nut("견과류",name);
			if(fc.addNewKind(nut, amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
			}
			else
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			break;
		default:
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요 : ");
			break;
		}//end switch
	}
	
	public void removeKind() {
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("삭제할 종류 번호 : ");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		switch(index) {
		case 1:
			Fruit fruit = new Fruit("과일",name);
			if(fc.removeKind(fruit)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
			}else {
				System.out.println("농산물 삭제에 실패하였습니다.");
			}
			break;
		case 2:
			Vegetable vegetable = new Vegetable("과일",name);
			if(fc.removeKind(vegetable)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
			}else {
				System.out.println("농산물 삭제에 실패하였습니다.");
			}
			break;
		case 3:
			Nut nut = new Nut("견과류",name);
			if(fc.removeKind(nut)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
			}
			else
				System.out.println("농산물 삭제에 실패하였습니다.");
			break;
			
			default:
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요 : ");
			break;
		}
	}
	
	public void changeAmount() {
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("수정할 종류 번호 : ");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("수정할 수량 : ");
		int changeNum = sc.nextInt();
		sc.nextLine();
		switch(index) {
		case 1: 
			Fruit fruit = new Fruit("과일",name);
			if(fc.changeAmount(fruit,changeNum)) {
				System.out.println("농산물 수량이 수정되었습니다. ");
			}else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요");
			}
			break;
		case 2:
			Vegetable vegetable = new Vegetable("과일",name);
			if(fc.changeAmount(vegetable,changeNum)) {
				System.out.println("농산물 수량이 수정되었습니다. ");
			}else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요");
			}
			break;
		case 3:
			Nut nut = new Nut("과일",name);
			if(fc.changeAmount(nut,changeNum)) {
				System.out.println("농산물 수량이 수정되었습니다. ");
			}else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요");
			}
			break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				break;
		}
	}
	
	public void printFarm() {
		HashMap<Farm, Integer> a = fc.printFarm();
		
		
		
		for(Farm key : a.keySet()) {
			
//			if(key instanceof Fruit) {     다운캐스팅 여러개 하는 방법 !
//				Fruit tmp = (Fruit)key;
//			}else if(key instanceof Vegetable) {
//				Vegetable tmp = (Vegetable)key;
//			}else if(key instanceof Nut) {
//				Nut tmp = (Nut)key;
//			}
			
			System.out.println(key+ "("+a.get(key)+"개)");
		}
		
	}
	
	public void buyFarm() {
		System.out.println("현재 KH마트 농산물 수량");
		printFarm();
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("구매 종류 번호 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("구매할 것 : ");
		String name = sc.nextLine();
		
		switch(index) {
		case 1:
			Fruit fruit = new Fruit("과일",name);
			if(fc.buyFarm(fruit)) {
				System.out.println("구매에 성공하였습니다.");
			}else
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요");
			break;
		case 2:
			Vegetable vegetable = new Vegetable("채소",name);
			if(fc.buyFarm(vegetable)) {
				System.out.println("구매에 성공하였습니다.");
			}else
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요");
			break;
		case 3:
			Nut nut = new Nut("견과류",name);
			if(fc.buyFarm(nut)) {
				System.out.println("구매에 성공하였습니다.");
			}else
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요");
			break;
		default:
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			break;
		}
		
		
	}
	
	public void removeFarm() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("취소 종류 번호 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("구매취소할 것 : ");
		String name = sc.nextLine();
		
		switch(index) {
		case 1:
			Fruit fruit = new Fruit("과일",name);
			if(fc.removeFarm(fruit)) {
				System.out.println("구매 취소에 성공하였습니다.");
			}else
				System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요");
			break;
		case 2:
			Vegetable vegetable = new Vegetable("채소",name);
			if(fc.removeFarm(vegetable)) {
				System.out.println("구매 취소에 성공하였습니다.");
			}else
				System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요");
			break;
		case 3:
			Nut nut = new Nut("견과류",name);
			if(fc.removeFarm(nut)) {
				System.out.println("구매 취소에 성공하였습니다.");
			}else
				System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요");
			break;
		default:
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			break;
		}
	}
	
	public void printBuyFarm() {
		Iterator<Farm> itr = fc.printBuyFarm().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
	
}
