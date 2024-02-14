package test4;

public class product {
	private String name;
	private int price;
	private int quantity;
	
	public product() {
		
	}

	public product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String information() {
		
		
		
		return this.toString();
	}


	@Override
	public String toString() {
		return "상품명 : " + name+ "\n가격 : " +price +"원"+"\n수량 : " + quantity + "개";
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getPrice() {
		return price;
	}

	protected void setPrice(int price) {
		this.price = price;
	}

	protected int getQuantity() {
		return quantity;
	}

	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
