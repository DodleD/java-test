package com.kh14_collection;

import java.util.Comparator;

public class SortedLottery implements Comparator<Lottery>{
	/*
	 * Comparator의 compare은 매개변수로 들어온 두 값을 비교
	 * 
	 * Comparable의 compareTo는 자기자신과 매개변수로 들어온 값을 비교
	 */

	@Override
	public int compare(Lottery o1, Lottery o2) {
		if(o1.getName().equals(o2.getName())) {
			return o1.getPhone().compareTo(o2.getPhone());
		}
		else	
			return o1.getName().compareTo(o2.getName());
	}

	

	
}
