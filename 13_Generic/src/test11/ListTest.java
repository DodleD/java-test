package test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i<10;i++) {
			
		list.add((int)(Math.random()*100+1));
//		System.out.print(list.get(i) + " ");
		}
		
//		Arrays.sort(list,Collections.reverseOrder());
//		Arrays.sort(list, Collections.reverseOrder());
		
		for(Integer a : list) {
			System.out.print(a + " ");
		}
		System.out.println(list.size());
		
		
		
		
		
		
		
//		Arrays.sort(list, Collections.reverseOrder());
		
		
		
	}
	
	
	
	
	
	public void display(List list) {
		for(int i = 0; i<10; i++) {
			System.out.println(list);
		}
		
		
		
	}
	
	
}
