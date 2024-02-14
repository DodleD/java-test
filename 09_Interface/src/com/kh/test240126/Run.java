package com.kh.test240126;

public class Run {

	public static void main(String[] args) {
		PhoneController p = new PhoneController();
		String[] str = new String[2];
		str = p.method();
		
		for(int i = 0; i<str.length;i++) {
			System.out.println(str[i]);
			System.out.println();
		}

	}

}
