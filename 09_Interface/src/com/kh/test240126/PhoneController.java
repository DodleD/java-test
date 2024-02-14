package com.kh.test240126;

public class PhoneController {
	String[] result = new String[2];
	
	public String[] method() {
		Phone[] p = new Phone[2];
		
		p[0]= new GalaxyNote9();
		p[1]= new V40();
		
		for(Phone phone : p) {
			if(p[0] instanceof GalaxyNote9) {
				result[0] =  ((SmartPhone)p[0]).printInformation();
		
			}
			if(p[1] instanceof V40){
				result[1] =	((SmartPhone)p[1]).printInformation();
			
			}
		}
		return result;

	}
}
