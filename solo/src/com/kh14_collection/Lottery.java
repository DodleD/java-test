package com.kh14_collection;



public class Lottery {
	private String name;
	private String phone;
	public Lottery() {
		super();
	}
	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	@Override
	public int hashCode() {
		String str = name+phone;
		return str.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Lottery) {
			Lottery other = (Lottery)obj;
			if(this.getName().equals(other.getName())&&
					this.getPhone().equals(other.getPhone())) {
				return true;
			}else
				return false;
			
		}else
			return false;
	}

	
	
	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}
	
	
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getPhone() {
		return phone;
	}
	public final void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
