package com.kh.Test240206;

public class Book {
	private String title;
	private String author;
	private String category;
	private int price;
	public Book() {
		super();
	}
	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	
	public int hashCode() {
		String str = this.title + this.title + this.category + this.price;
		return str.hashCode();
	}
	
	public boolean equals(Object obj) {
		boolean isEqauls = false;
		if (obj instanceof Book) {
			Book tmp = (Book)obj;//넘겨받은 오브젝트가 상속관계에 있다면 다운캐스팅 가능
			if(this.getTitle().equals(tmp.getTitle())&&
					this.getAuthor().equals(tmp.getAuthor())&&
					this.getCategory().equals(tmp.getCategory())&&
					this.getPrice() == tmp.getPrice()) {
				isEqauls = true;
			}
		}
		return isEqauls;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "(" + title + "/" + author + "/" + category + "/" + price + ")";
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
	protected String getCategory() {
		return category;
	}
	protected void setCategory(String category) {
		this.category = category;
	}
	protected int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
	
	
}
