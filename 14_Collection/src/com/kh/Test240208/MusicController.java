package com.kh.Test240208;

import java.util.ArrayList;
import java.util.List;

import com.kh.Test240206.Book;

public class MusicController {
	List<Music> list = new ArrayList<>();
	
	public int addList(Music music) {
		if(list.add(music)) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int addAtZero(Music music) {
		list.add(0,music);
		return 1;
			
			
			
		
	}
	
	public List printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.get(i);
			}
		}
		
		return null;
	}
	
	public Music removeMusic(String title) {
		
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {

				return list.remove(i);
			}
		}
		
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {

				return list.set(i, music);
			}
		}
		
		return null;
	}
	
	public int ascTitle() {
		try {
			this.list.sort((obj1, obj2) -> ((Music)obj1).getTitle().compareTo(((Music)obj2).getTitle()));
			return 1;
			}catch(Exception e) {
				return 0;
			}
	}
	
	public int descSinger() {
		try {
			this.list.sort((obj1, obj2) -> ((Music)obj1).getSinger().compareTo(((Music)obj2).getSinger()));
			return 1;
			}catch(Exception e) {
				return 0;
			}
	}
}
