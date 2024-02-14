package com.kh.practice01;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	
	
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		int b = st.countTokens();
		String a = "";
		for(int i = 0; i<b ; i++) {
			a+=st.nextToken();
		}
		return a;
	}
	
	public String firstCap(String input) {
		String a= input.substring(0,1).toUpperCase();
	
		return a.concat(input.substring(1));
		
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		char[] arr = input.toCharArray();
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]==one)
				count++;
		}
		return count;
	}
	
}
