package com.kh.Ex02;

public class University {
	private String name;
	private int evgCut;
	private int koCut;
	private int enCut;
	
	public University(String name, int evgCut, int koCut, int enCut) {
		this.name=name;
		this.evgCut=evgCut;
		this.koCut=koCut;
		this.enCut=enCut;
	}
	
	public String getName() {
		return this.name;
	}
	public int getevgCut() {
		return this.evgCut;
	}
	public int getkoCut() {
		return this.koCut;
	}
	public int getenCut() {
		return this.enCut;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setevgCut(int evgCut) {
		this.evgCut=evgCut;
	}
	public void setkoCut(int koCut) {
		this.koCut=koCut;
	}
	public void setenCut(int enCut) {
		this.enCut=enCut;
	}
	//합격하면 true, 불합격하면 false 리턴
	public void isEvaluate(Student choi) {
		if(this.getevgCut()<choi.getEvg()&&
				this.getkoCut()<choi.getG()&&
				this.getenCut()<choi.getEng())
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
	}
	

}
