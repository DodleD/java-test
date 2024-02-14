package com.kh.Test240125;

public class CookBook extends Book{
	private boolean coupon ;

	public CookBook() {
		super();
	}

	public CookBook(String title, String author, String publisher,boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook ["+super.toString()+"coupon= " + coupon + "]";
	}

	protected boolean isCoupon() {
		return coupon;
	}

	protected void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
	public boolean getCoupon() {
		return this.coupon;
	}
	
	
	
}
