package com.kh14_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class LotteryController {
	HashSet lottery = new HashSet();
	HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		return lottery.remove(l);
	}
	
	public HashSet winObject() {
		ArrayList list = new ArrayList();
		list.addAll(lottery);
		if(lottery.size()<4) {
			return null;
		}
		while(win.size()<4) {
			win.add(list.get(((int)((Math.random()*list.size())))));
		}
		return win;
	}
	
	public TreeSet sortedWinObject(){
		TreeSet<Lottery> tree = new TreeSet<>(new SortedLottery());	
		tree.addAll(win); 
		return tree;	
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
