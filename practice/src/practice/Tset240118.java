package practice;

import java.util.Scanner;

public class Tset240118 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//		double n1 = sc.nextDouble();
//		double n2 = sc.nextDouble();
//		
//		System.out.println(n1+n2);
//		System.out.println(n1%n2);
//		System.out.println(n1/n2);
//		
//		//====================================
//		
//		double n3 = sc.nextDouble();
//		
//		if(n3<=100)
//			System.out.println("100이하");
//		else if(n3>100 && n3<=200)
//			System.out.println("200이하");
//		else if(n3>200 && n3<=300)
//			System.out.println("300이하");
//		else
//			System.out.println("300초과");
//		
//		//====================================
//		
//		int math = sc.nextInt();
//		int eng = sc.nextInt();
//		int g = sc.nextInt();
//		
//		if((math+eng+g)/3>=60)
//			System.out.println("합격입니다.");
//		else
//			System.out.println("불합격 입니다.");
//		
		//===================================
		
//		int[] arr1 = new int[9];
//		
//		for(int i = 0; i<arr1.length ; i++) 
//			arr1[i]=(i+1)*2;
//		for(int i = 0; i<arr1.length ; i++)
//			System.out.println(2+" * "+ (i+1) + " = " + arr1[i]);
//		
//		//====================================
//			
//		int[] arr2 = new int[9];
//		
//		for(int i = 0; i<arr2.length ; i++) 
//			arr2[i]=(i+1)*3;
//		for(int i = 0; i<arr2.length ; i++)
//			System.out.println(3+" * "+ (i+1) + " = " + arr2[i]);
		
		//====================================
		
		int[][] arr3 = new int[8][9];
		System.out.println(arr3[0].length);
		for(int i = 0; i<arr3.length ; i++) {
			for(int j = 0; j<arr3[0].length; j++) {
				arr3[i][j]=(i+2)*(j+1);
			}
		}
		for(int i = 0; i<arr3.length ; i++) {
			for(int j = 0; j<arr3[0].length ; j++)
				System.out.println(i+2+" * " + (j+1) + " = " + arr3[i][j]);
			System.out.println();
		}
	} 

}
