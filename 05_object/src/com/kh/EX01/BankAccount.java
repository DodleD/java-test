package com.kh.EX01;

public class BankAccount {
	//클래스의 데이터 정의하는 곳
	int balance = 0;
	String accNumber;
	String ssNumber;
	String gender;
	int reigNum;
	int passNum;
	
	//생성자(데이터 초기화를 위한 특수목적 메소드)
	//생성자는 class와 이름이 동일한 메소드이다, 반환형이 존재하지 않는다.
	//아무것도 만들지 않으면 컴파일러가 기본생성자를 만들어준다.
	public BankAccount(String acc, String ss, int bal) {
		this.accNumber = acc;
		this.ssNumber = ss;
		this.balance = bal;
	} //this 는 호출 한 놈이 나 다. 나를 다시 호출하는 것. 
	//항상 최 상단에 위치해있어야 한다.
	
	
//	//데이터 초기값 세팅을 위한 메서드 생성. 사실상 필요없음.
//	public void iniAccount(String acc, String ss, int bal) {
//		accNumber = acc;
//		ssNumber = ss;
//		balance = bal;
//	}
//	
	public void gender(String g) {
		gender=g;
	}
	
	public void Num(int rNum, int pNum) {
		reigNum = rNum;
		passNum = pNum;
		
	}

	public int deposit(int amount) {
		balance +=amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -=amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	
	public boolean balanceEquals(BankAccount act01) {
		if(balance == act01.balance){
			return true;
		}else {
			return false;
		}
		
		
	}
}
