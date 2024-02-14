package Movie;

public class Menu {
	//필드구역
	private String[] List = {"팝콘","콜라","사이다","핫도그","카라멜팝콘","버터오징어"};
	private int[] price = {4000,2000,2000,3500,5000,4500};
	private String start ;
	private String[] pick = new String[List.length];
	private int random = 0;
	//생성자
	public Menu(String start) {
		this.start=start;
		if(this.start.equals("예")) {
			System.out.println("메뉴판 입니다. 원하시는 걸 쳐주세요");
			System.out.println("========================================");
			
			for(int i = 0 ; i <  List.length ; i++) {
				System.out.print("("+List[i]+" : "+price[i]+"원)"+"  ");
			}
			System.out.println();
			System.out.println("중에 선택하시고 주문을 종료하시려면 0번을 눌러주세요");
		}
		else
			System.out.println("취소하셨습니다.");
	}
	
	//메소드
	public void print(String start) {
		random =(int)(Math.random()*3+1);
		if(this.start.equals(start))
			System.out.println("주문 완료됐습니다. 대기번호는 "+ random + "입니다.");
		else {
			System.out.println("다시 주문해주세요.");
			return;
		}
	}
	
	
	//getter 구간
	
	public String[] getPick() {
		return this.pick;
	}
	
	public int []getPrice(){
		return this.price;
	}
	
	
	
	//setter 구간
	
	public void setPick(String[] pick) {
		this.pick=pick;
	}
	public void setPrice(int[] price) {
		this.price=price;
	}
	
}
