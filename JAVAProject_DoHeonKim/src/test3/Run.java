package test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
		Date date = new Date(2023 - 1936, 7-3, 27);
		Date nowDate = new Date();
		
		SimpleDateFormat birthday = new SimpleDateFormat("생일 : yyyy년 MM월 dd일 E요일");
		SimpleDateFormat now = new SimpleDateFormat("현재 : yyyy년 MM월 dd일 ");
		
		String strDate = birthday.format(date);
		String strNowDate = now.format(nowDate);

		System.out.println(strDate);
		System.out.println(strNowDate);
		System.out.println("나이 : " + (nowDate.getYear()-date.getYear()) + "세");

	}

}
