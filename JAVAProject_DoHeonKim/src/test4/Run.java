package test4;

public class Run {

	public static void main(String[] args) {
		product p = new product("갤럭시 s7", 563500, 3);
		
		System.out.println(p.information());
		System.out.println("총 구매 가격 : "+p.getPrice()*p.getQuantity()+" 원");
		
		
	}

}
