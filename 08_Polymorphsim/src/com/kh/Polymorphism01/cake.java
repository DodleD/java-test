package com.kh.Polymorphism01;

class cake {
	public void yummy() {
		System.out.println("yummy cake");
	}
}

class Cheesecake extends cake {
	public void yummy() {
		System.out.println("yummy Chessecake");
	}
}

class strawberryChessecake extends Cheesecake {
	public void yummy() {
		System.out.println("yummy strawberryChesseCake");
	}
}