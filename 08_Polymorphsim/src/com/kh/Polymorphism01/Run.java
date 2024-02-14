package com.kh.Polymorphism01;

public class Run {

	public static void main(String[] args) {
		cake c1 = new strawberryChessecake();
		Cheesecake c2 = new strawberryChessecake();
		strawberryChessecake c3 = new strawberryChessecake();
		c1.yummy();
		c2.yummy();

	}

}
