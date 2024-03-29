package com.kh.Test240208;

import java.util.Comparator;
public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		if(o1.getTitle().equals(o2.getTitle())) {
			return o1.getTitle().compareTo(o2.getTitle());
		}
		else	
			return o1.getSinger().compareTo(o2.getSinger());
	}
	
}
