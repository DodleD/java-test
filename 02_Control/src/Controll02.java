import java.util.Scanner;
public class Controll02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Double g, e, m;
		
		System.out.println("국어 : ");
		g = sc.nextDouble();
		System.out.println("영어 : ");
		e = sc.nextDouble();
		System.out.println("수학 : ");
		m = sc.nextDouble();
		
		int total=(int)(g+e+m);
		double avg=(g+e+m)/3;
		
		
		
		if(g>=40 && e>=40 && m>=40) {
			if(avg>=60) {
				System.out.println("국어 : " + (int)+g);
				System.out.println("영어 : " + (int)+e);
				System.out.println("수학 : " + (int)+m);
				System.out.println("총점 : "+ total);
				System.out.println("평균 : "+ avg);
				System.out.println("축하합니다, 합격입니다.");
			}
			else
				System.out.println("불합격입니다.");
		}
		else
			System.out.println("불합격입니다.");
		
	}
}
