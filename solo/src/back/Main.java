package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{ //BufferedReader는 예외처리 필수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		Stack<Integer> st = new Stack<>(); //Integer형 스택을 만듬.
		
		int index = Integer.parseInt(reader.readLine()); //입력받을 개수
		String str; //입력받은 문자열
		String[] strArray = new String[2]; //문자열을 잘라 배열에 넣을 용도
		int count=0; //size를 출력하기위한 변수, push와 pop이 실행될 때 마다 변동됨
		for(int i =0; i<index; i ++) { //입력받은 index만큼 반복
			str = reader.readLine();
			strArray = str.split(" "); //split을 사용해서 공백기준을 기준으로 문자열 자름		
			
			switch(strArray[0]) {// 자른 문자열 첫 번째
			case "push"://스택에 값 추가
				push(st,Integer.parseInt(strArray[1])); //추가되는 값 넣어줌
				count++; //push이 실행되면 총 개수가 늘어난거니까 ++;
				break;
			case "pop"://스택 젤 윗값 제거
				pop(st); 
				if(count!=0) //-1이 되면 안되니 붙는 조건
					count--; //pop이 실행되면 총 개수가 줄어든거니까 --;
				break;
			case "size": //스택에 들어있는 총 개수
				size(count); 
				break;
			case "empty": //비어있나 확인하는 것
				empty(st);			
				break;
			case "top": //스택의 젤 위에 값 출력,비어있으면 -1
				top(st);			
				break;
				default:
					break;
				
			}//end switch
		}//end for
		
		
		

	}//end main
	
	
	public static void push(Stack<Integer> st,int i) { //매개변수가 Integer형 Stack이니까 설정
		st.add(i);
	}
	
	public static void pop(Stack<Integer> st) { //값 제거
		if(st.empty()) //비어있나?
			System.out.println("-1"); //true
		else
			System.out.println(st.pop()); //false
	}
	
	public static void size(int count) {
		System.out.println(count);
	}

	public static void empty(Stack<Integer> st) {
		if(st.empty())
			System.out.println("1");
		else
			System.out.println("0");
	}

	public static void top(Stack<Integer> st) {
		try {
				System.out.println(st.peek()); //peek 메서드는 예외처리를 해야 오류가 나지 않는다.
		}catch(NoSuchElementException e) {
			System.out.println("-1");
		}catch(EmptyStackException e) {
			System.out.println("-1");
		}
	}//end top
	
}//end Main
