package B_2231;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
			
		String n = bf.readLine();
		int c = 0 ;
		int cc = 0;

		
		for(int i=0 ; i<n.length(); i++) {

			c += Character.getNumericValue(n.charAt(i));
		}	
		int m = Integer.parseInt(n)-c;		
		System.out.println(m);
		String sm = Integer.toString(m);
	
		
		for(int i=0; i<sm.length(); i++) {
			cc+=Character.getNumericValue(sm.charAt(i));
		}
		
		int mm = Integer.parseInt(sm)+cc;
		System.out.println(mm);
	}

}
