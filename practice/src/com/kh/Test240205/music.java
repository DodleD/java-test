package com.kh.Test240205;

public class music {
	private String title;
	private String artist;
	
	
	
	public music() {
		super();
	}
	public music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	
	
	@Override
	public String toString() {
		return "music [title=" + title + ", artist=" + artist + "]";
	}
	
	
	
	protected String getTitle() {
		return title;
	}
	protected void setTitle(String title) {
		this.title = title;
	}
	protected String getArtist() {
		return artist;
	}
	protected void setArtist(String artist) {
		this.artist = artist;
	}
	
	
}
