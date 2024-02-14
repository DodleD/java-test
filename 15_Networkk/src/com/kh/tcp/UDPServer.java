package com.kh.tcp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {
		int port = 4000;
		try {//포트 4000으로 받을 준비 완료 !
			DatagramSocket dsoc = new DatagramSocket(port);
			
			//전송받은 데이터를 저장할 바이트 배열 선언
			byte[] data = new byte[60000];
			
			//클라이언트로부터 받을 Packet 객체 생성
			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("데이터 받을 준비 완료");
			
			while(true) {
					//데이터 전송된 것 받아주기
					dsoc.receive(dp);
					//데이터 확인해보기
					System.out.println("클라이언트 IP : " + dp.getAddress());
					String message = new String(dp.getData(),"UTF-8");
					System.out.println("클라이언트가 보낸 내용 : " + message);
			}
				} catch (SocketException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}
	
	
			
	
		
		
		
		
		
		
		
		
		
		
		
	}
	
}