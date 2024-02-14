package com.kh.api01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D_Date {
	
	public void mathod01() {
		Date date1 = new Date();
		System.out.println(date1);
		
		//내가 원하는 날짜(2023년 07월 27일)로 세팅하고싶다면?
		//1. 매개변수써서 세팅
		
		Date date2 = new Date(2023 - 1900, 7-1, 27);
		System.out.println(date2);
		
		//2. 기본 생성자로 생성한후 setter메소드로 변경
		date1.setDate(2023 - 1900);
		date1.setMonth(7-1);
		date1.setDate(27);
		System.out.println(date1);
		
		System.out.println(date1.getTime());
		System.out.println(date2.getTime());
		System.out.println(date1.getTime()> date2.getTime());
		
		//2023년 07월 일 02시 56분 37초
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
	}
}
