package tt;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int[] t = new int[n];
		int[] p = new int[n];
		boolean[] onOff = new boolean[n];
		for(int i = 0; i<n; i++) {
			t[i]=sc.nextInt();
			p[i]=sc.nextInt();
			onOff[i]=true;
			
			if(t[i]+i>n) {
				onOff[i]=false;
			}
			System.out.println(onOff[i]);
		}
		for(int i=0; i<n; i++) {
			if(onOff[i]) {
				
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
