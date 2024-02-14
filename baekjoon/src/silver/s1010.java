package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1010 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int nSite = 0;
		int mSite = 0;
		int test = 0;
		int result = 0;
		test = Integer.parseInt(bf.readLine());
		for(int i = 0; i<test; i++) {
			String[] str = bf.readLine().split(" ");
			nSite = Integer.parseInt(str[0]);
			mSite = Integer.parseInt(str[1]);
			
			if(nSite==mSite) {
				System.out.println(nSite);
			}else {
				while(nSite!=1) {
					mSite =843;
					result += nSite * mSite;
					nSite--;
					mSite--;
					System.out.println(nSite);
				}
			}
			
			
		}
		System.out.println(result);
	}
	
	
	
	
	
	
	public static double fact(double n) {
		if(n<=1)
			return n;
		else
			return fact(n-1) * n;
	}
	

}
