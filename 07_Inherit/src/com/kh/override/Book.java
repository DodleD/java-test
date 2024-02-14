package com.kh.override;

public class Book {
	@Override
	public String toString() {
		return "Book [tilte=" + tilte + ", author=" + author + "]";
	}
	private String tilte;
	private String author;
	
	
	public Book(String tilte, String author) {
		super();
		this.tilte = tilte;
		this.author = author;
	}
	
	
	public String getTilte() {
		return tilte;
	}
	public void setTilte(String tilte) {
		this.tilte = tilte;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
