package com.kh.Test2402062;

import com.kh.Test240206.Student;

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
	public int hashCode() {//모든 필드에 담긴 값이 일치하면 동일한 hashCode반환
		String str = name+phone;
		
		return str.hashCode();
	}
	
	
	
	@Override
	public boolean equals(Object obj) {//현재 객체와 전달받은 객체의 각 필드값들이 모두 일치하면 true /하나라도 일치하지 않으면 false 반환
		//this(현재객체)    <->    obj(전달받은 객체)
		//  Lottery                Object
		if(obj instanceof Lottery) {
			Lottery other = (Lottery)obj;
			
			if(this.getName().equals(other.getName())&&
					this.getPhone().equals(other.getPhone())) {
			return true;	
		} else 
			return false;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Lottery [name=" + name + ", phone=" + phone + "]";
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getPhone() {
		return phone;
	}
	protected void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
