package test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		
		System.out.print("정렬전 : ");
		for(int i =0; i<10; i++) {
			list.add(random.nextInt(100)+1);
			System.out.print(list.get(i) + " ");
		}

//		list.sort(Collections.reverseOrder());
	
		Collections.sort(list,new Decending());
		
		
//		System.out.print("\n정렬후 : ");
//		for(int i =0; i<list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//		}
		
		
		display(list);

	}


	public static void display(List<Integer> list) {
		System.out.print("\n정렬후 : ");
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	
}
