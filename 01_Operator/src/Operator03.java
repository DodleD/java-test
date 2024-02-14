
public class Operator03 {
	public static void main(String[] args){
		
		int a = 5;
		int b= 10;
		
		int c = (++a) + b; // 16
		int d = c/a; // 2
		int e = c % a; // 4
		int f = e++; // 4
		int g = (--b)+(d--); // 11
		int h = 2;
		int i = (a++) + b / (--c / f ) *(g-- - d) % (++e +h); 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
		
	}
}
