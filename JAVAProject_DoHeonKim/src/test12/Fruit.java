package test12;

public class Fruit {
	private String name;
	private int price;
	private int quantity;
	
	public Fruit() {
		super();
	}
	
	
	public Fruit(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	
	@Override
	public String toString() {
		return name + ", " + price + "원, " + quantity + "개";
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
