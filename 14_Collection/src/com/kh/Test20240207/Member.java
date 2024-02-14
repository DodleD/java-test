package com.kh.Test20240207;

public class Member {
	private String name;
	private String password;
	public Member() {
		super();
	}
	public Member(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", password=" + password + "]";
	}
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getPassword() {
		return password;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	
	
}
