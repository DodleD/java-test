package com.kh.Test240125;

public class AniBook extends Book{
	
	private int accessAge = 0;
	

	public AniBook() {
		super();
	}


	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title,author,publisher);
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "AniBook ["+super.toString()+"accessAge= " + accessAge + "]";
	}


	protected int getAccessAge() {
		return accessAge;
	}


	protected void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	

}
