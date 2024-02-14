package test6;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		System.err.println("입력해주세요 : ");
		
		if(c.getSum(sc.nextInt())!=0)
		System.out.println("결과값 : "+c.getSum(sc.nextInt()));

	}

}
