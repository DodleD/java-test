package com.kh.api01;

import java.util.StringTokenizer;

public class B_String {
	public void mathod01() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 + str2);
		//String 클래스에 toString메소드 이미 오버라이딩 되어있음 !(실제 담긴 문을 반환하도록)
		
		System.out.println(str1==str2 ); // 주소값 비교라서
		
		System.out.println(str1.equals(str2));
		//String 클래스에 equals메소드는 이미 오버라이딩 되어있음(주소값 비교가 아닌 담긴 문자값을 비교하도록 오버라이딩 되어있음)
		
		
		//String의 hashcode메소드 이미 오버라이딩 되어있다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		//주소값에 대한 hashcode가 알고 싶다면 메소드를 이용해야한다.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println("===========================================");
		
		//문자열을 리터럴값으로 생성
		String str3 = "hello";
		String str4 = "hello";
		
		//리터럴 제시시 리터럴 영역(상수풀)에 올라가 상수풀에 리터럴을 등록하고 가리킴
		//만약 같은 리터럴값이 있다면 주소값도 같아진다.
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3.hashCode());
		
		System.out.println(str3 == str4);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		str4= "hi";
		//string 클래스 == 불변클래스(변하지 않는 클래스)
		//변경이 가능하지만 수정되는 개념이 아니라 새로 생성하여 교체
			
		//변경하는 순간 기존의 문자열 자리에서 변경되는게 아닌
		//새로운 곳을 참조하도록 됨 (새로운 주소값 부여받음 == 주소값 변경)
		
	}
	
	
	
	public void mathod02() {
		String str1 = "Hello world";
		
		//메소드명(매개변수) : 반환형
		
		//1. 문자열.charAt(int index) : char
		//   문자열에서 전달받은 index의 위치에 문자만을 추출해서 리턴
		
		char ch = str1.charAt(3);
		System.out.println(ch);
		
		//2. 문자열.concat(String str) : String
		//   문자열과 전달된 또 다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!"); //참조, 새로운 객체를 만들기 때문에 주소값이 다르다.
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!"; //상수, 위에서 한 리터럴
		
		System.out.println(str3);
		//str2와 str3의 담긴 문자열은 일치하나 담겨있는 주소값은 다르다.
		System.out.println("str2와 str3는 일치하는가 : " + (str2==str3));
		
		//3. 문자열.equals(Object obj) : boolean
		//   문자열과 전달된 문자열을 가지고 주소값 비교가 아닌 실제 문자열 값을 가지고 동등비교
		System.out.println("str2와 str3는 일치하는가 : " + str2.equals(str3));
		
		//4. 문자열.contains(Charsequence s) : boolean
		System.out.println("str1에 Hello라는 문자열이 포함되어 있습니까 ? : " + str1.contains("Hello"));
		System.out.println("str1에 bye라는 문자열이 포함되어 있습니까 ? : " + str1.contains("bye"));
		
		//5. 문자열.length() : int
		System.out.println("str1의 길이 : " + str1.length());
		
		//6. 문자열.substring(int beginIndex) : String  -> 문자열의 beginIndex위치에서부터 끝까지 문자열 추출해서 리턴
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(6,9));
		
		//7. 문자열.replace(char oldchar, char newchar) : String
		//   문자열에서의 oldchar문자를 newchar문자로 변환한 새 문자열 리턴
		String str4 = str1.replace('l', 'c');  
		System.out.println(str4);
		
		//8. 문자열.toUpperCase() : String ->대문자변환
		//   문자열.toLowerCase() : String ->소문자변환
		
		//9. 문자열.trim() : String
		//   문자열의 앞 뒤 공백을 제거시킨 새 문자열을 리턴
		
		String str6 = "JA      VA  ";
		System.out.println(str6.trim());
		
		//10. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		
		for(char Arr : arr)
		System.out.print(Arr+" ");
		
		System.out.println(str6.valueOf(arr));
	}


	public void mathod03() {
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		//구분자를 기준으로 문자열을 분리시키는 방법.
		
		//방법 1. 분리된 문자열을 String[] 배열에 차곡차곡 담고싶을 때
		//       String클래스에  제공하는 split 메소드 이용
		//       문자열.split(구분자) : String[]
		
		String[] arr = str.split(","); //자를게 없으면 그냥 리턴. 최소로 1개 반환됨(자기자신)
		
		System.out.println("배열의 길이 : " + arr.length);
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		//방법 2. 분리된 문자열들을 각각 토큰으로써 관리하고자 할 때
		//       java.util.Stringtokenizer 클래스 이용하는 방법
		StringTokenizer st = new StringTokenizer(str,",");
		int j = st.countTokens();
		for(int i = 0; i<j;i++)
			System.out.println(st.nextToken());
		
		System.out.println(st.countTokens());
		
		
		//방법 2, while문 안에 hasmore에 값이 남아있으면 true 없으면 false임
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

		
}
