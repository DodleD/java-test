package test5;

public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	
	public Book() {
		
	}


	public Book(String title, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	
	
	
	
	
	
	

	@Override
	public String toString() {
		return this.title+", "+this.author+", "+this.publisher+", "+this.price+"원, "+(int)(this.discountRate*100)+"% 할인 "+"\n할인된 가격 : "+(int)(this.price*this.discountRate*10)+"원";
	}


	protected String getTitle() {
		return title;
	}


	protected void setTitle(String title) {
		this.title = title;
	}


	protected String getAuthor() {
		return author;
	}


	protected void setAuthor(String author) {
		this.author = author;
	}


	protected int getPrice() {
		return price;
	}


	protected void setPrice(int price) {
		this.price = price;
	}


	protected String getPublisher() {
		return publisher;
	}


	protected void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	protected double getDiscountRate() {
		return discountRate;
	}


	protected void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	

	
}
