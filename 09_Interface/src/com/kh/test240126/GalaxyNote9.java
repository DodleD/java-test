package com.kh.test240126;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		setMaker("삼성");
	}

	@Override
	public String makecall() {
		
		return "번호를 누르고 통화버튼을 누름";
	}

	

	@Override
	public String takeCall() {
		
		return "전화받기 버튼을 누름";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식 와콤펜 지원";
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "고속 충전, 고속 무선 충전";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1300만 듀얼카메라";
	}

	@Override
	public String printInformation() {
		String str = "갤럭시 노트9은 삼성에서 만들어졌고 제원은 다음과 같다."
				+"\n"+makecall()+"\n"+takeCall()+"\n"+
				charge()+"\n"+picture()+"\n"+touch()+"\n"
				+"블루투스 펜 탑재 여부 = "+bluetoothPen();
		
		return str;
	}
	
	@Override
	public boolean bluetoothPen() {
		
		return true;
	}
	
}
