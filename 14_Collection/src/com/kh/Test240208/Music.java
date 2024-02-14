package com.kh.Test240208;

import Collection_generic.Farm;
import Collection_generic.Fruit;

public class Music {
	private String title;
	private String singer;
	
	
	
	
	public Music() {
		super();
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	public int hashCode() {
		String str = this.title + this.singer;
		return str.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {//현재 객체와 전달받은 객체의 각 필드값들이 모두 일치하면 true /하나라도 일치하지 않으면 false 반환
		//this(현재객체)    <->    obj(전달받은 객체)
		//  Lottery                Object
		if(obj instanceof Music) {
			Music other = (Music)obj;
			
			if(this.getTitle().equals(((Music)other).getTitle())&&
					this.getSinger().equals(other.getSinger())) {
			return true;	
		} else 
			return false;
		}
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "(" + title + ", "+ singer + ")";
	}
	
	
	
	
	
	protected String getTitle() {
		return title;
	}
	protected void setTitle(String title) {
		this.title = title;
	}
	protected String getSinger() {
		return singer;
	}
	protected void setSinger(String singer) {
		this.singer = singer;
	}
	
	
}
