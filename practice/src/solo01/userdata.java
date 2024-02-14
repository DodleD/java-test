package solo01;

public class userdata {
	private String name;
	private int price;
	private int quantity;
	public userdata(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "[음료=" + name + ", 가격=" + price + ", 수량=" + quantity +"]";
	}


	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
}
