package com.kh.Test240206;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class mapRun {
	public static void main(String[] args) {
	HashMap hm = new HashMap();
	
	/*
	 * 계층구조에 List계열, Set계열의 클래스들은 collection을 구현한 클래스이다.
	 * -> 객체를 추가하고자 할 때 공통적으로 add메소드를 사용
	 * 
	 * map계열은 collection을 구현한 클래스가 아니므로 add를 사용하지 않는다.
	 * 그 대신에 put 메소드를 이용한다.
	 * 1. put(key + value)로 담아야한다. map에 키 밸류 세트로 추가시켜주는 메소드
	 */
	hm.put("다이제", new Snack("초코맛", 1000));
	hm.put("칸초", new Snack("단맛", 500));
	hm.put("새우깡", new Snack("짠맛", 500));
	hm.put("먹태깡", new Snack("짠맛", 300));
	System.out.println(hm); //{키=벨류, 키=밸류...}
	//저장되는 순서 유지 안됨 !! value 값이 중복되어도 키값이 중복되지 않는다면 잘 저장됨.
	
	hm.put("새우깡", new Snack("짠맛", 600));
	//동일한 키 값으로 다시 추가하는 경우 value값이 덮어씌워짐 ! (중복된 키 값 공존할 수 없음!), 키 값이 식별자 역할
	System.out.println(hm);
	
	/*
	 * 2. get(object key) : V => 해당 키 값을 가지는 value 값을 반환시켜주는 메소드.
	 * 
	 */
	
	Snack s = (Snack)hm.get("다이제");
	System.out.println(s);
	
	//3. size(): 담겨있는 객체들의 개수 반환
	System.out.println(hm.size());
	
	//4. replace(k key, v value) -> 해당 키 값을 찾아서 다시 전달한 value 값으로 수정시켜주는 메소드
	hm.replace("다이제", new Snack("묵직", 6000));
	System.out.println(hm);
	
	//5. remove(Object key) -> 해당 키 값을 찾아서 그 벨류세트를 삭제시켜주는 메소드
	hm.remove("칸초");
	System.out.println(hm);
	
	
	//for each문 사용 불가능.
	//list에도 못넣음 완전 독립전인 친구 . 이유는 컬렉션으로부터 나온 애가 아니라서
	
	//iterator 반복자 이용가능? ㄴㄴ안됨
	//바로 iterator를 호출할 수 없음, -> Iterator도 list계열 또는 set계열에서만 가능.
	
	//Map -> Set 으로 변경해주는 메소드를 제공한다. 
	
	//1. ketSet() 이용하는 방법
	Set keySet = hm.keySet();
	System.out.println(keySet);
	
	Iterator  itkey = keySet.iterator();
	while(itkey.hasNext()) {
		String key = (String)itkey.next();
		Snack value = (Snack)hm.get(key);
		System.out.println(key + "  :  " + value);
	}
	
	//===============================================
	
	//2. entrySet() 이용하는 방법
	Set entrySet = hm.entrySet(); //key+value 세트의 집합을 리턴
	
	Iterator  itentry = entrySet.iterator();
	
	
	while(itentry.hasNext()) {
		Entry entry = (Entry)itentry.next();
		
		String key = (String)entry.getKey();
		Snack value = (Snack)entry.getValue();
		
		System.out.println(key + "  :  " + value);
	}
	
			
			
	//Properties : Map 계열의 컬렉션 -> 키 + 벨류 세트로 저장.
	
	Properties prop = new Properties();
	Properties prop2 = new Properties();
//	//map 계열이기 때문에 put 메소드를 이용해서 key + value로 담는다.
//	prop.put("다이제", new Snack("초코맛", 1000));
//	prop.put("칸초", new Snack("단맛", 500));
//	prop.put("새우깡", new Snack("짠맛", 500));
//	prop.put("먹태깡", new Snack("짠맛", 300));
	prop.setProperty("list", "ArrayList");
	prop.setProperty("set", "Hashset");
	prop.setProperty("Map", "HasMap");
	prop.setProperty("Map", "properties");
	
	
	System.out.println(prop);
	
	//Properties 사용하는 경우는 주로 Properties에 담긴 것들을 파일로 출력 또는 입력받아 올때 사용법
	//즉, Properties에서 제공하는 store(), load()등의 메소드를 사용하기위해서 사용
	
	try {
		//properties에 담겨있는 key-value들을 파일형태로 입력받아 올때 사용함.
		prop.store(new FileOutputStream("test.properties"), "PropertiesTest");
		//내부적으로 실행시 Properties에 담겨있는 키 + 밸류 세트들을 String으로 형변환해서 출력한다.
		
		prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
		prop2.load(new FileInputStream("test.properties"));
		
		prop2.loadFromXML(new FileInputStream("test.xml"));
		System.out.println(prop2);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}			
			
	/*
	 * properties 파일을 사용하는 이유
	 * 프로그램상에 필요한 기본 환경설정(서버의 ip주소, dbms경로 ..)관련된 구문을 기술할 것이다.
	 * ->모두 문자열이기 때문에 개발자가 아닌 일반관리자가 해당 문서를 수정하기 쉽지않다.
	 * 
	 * xml -> 프로그래밍 언어들간에 있어서 호환성이 좋다.
	 */
	
	
			
	}
}
