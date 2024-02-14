package com.kh.EX01;

public class Run {

	public static void main(String[] args) {
		/*
		BankAccount yoon = new BankAccount(); //이걸로 생성해서 만든게 인스턴스 객체이다.
		BankAccount choi = new BankAccount();
		//String arr 과 똑같은 형식(참조 변수를 만든 것)
		
		yoon.deposit(5000);
		choi.deposit(3000);
		
		yoon.withdraw(2000);
		
		
		yoon.checkMyBalance();
		choi.checkMyBalance();
		
		System.out.println(yoon.balanceEquals(choi));
		*/
		
		BankAccount choi = new BankAccount("11354413", "135135-12435", 10000);
		
		
		BankAccount park = new BankAccount("3513515", "531354-102135", 1111);

		
		System.out.println(park.accNumber+" "+park.ssNumber+" "+park.balance);
		System.out.println(choi.accNumber+" "+choi.ssNumber+" "+choi.balance+" "+park.gender);
		
		choi.Num(22255523, 2015313);
		
		System.out.println((choi.reigNum)+" "+ (choi.passNum));
		
	}

}
