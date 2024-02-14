package com.kh.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	/*
	 * TCP(Transmission Control Protocol)
	 * 서버, 클라이언트간에 1:1 소캣통신.
	 * -데이터를 교환하기에 앞서 서버, 클라이언트 연걸이 되어야한다.(서버가 먼저 실행되어 클라이언트의 요청을 기다려야함)
	 * -신뢰성 있는 데이터 전달 가능
	 * 
	 * *SoKet
	 *  -프로세스간의 통신을 담당
	 *  - Input / OutputStream을 가지고 있다.(이 스트림을 통해서 입출력이 이루어진다)
	 *  
	 *  *ServerSocket
	 *  -포트와 연결(Bind)되어 외부의 연결요청을 기다린다. -> 요청이 들어오면 수락해준다.
	 *  수락->통신할 수 있는 소켓이 생성된다
	 *  
	 * 
	 * 
	 */
	//서버용 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		//1) 포트번호 지정(서버측에서 몇 번 포트로 통로를 열겠냐) 라는 의미가 있다.
		int port = 3000;
		
		ServerSocket server;
		try {
			//2) serverSocket 객체 생성시 포트결합(Bind)
			server = new ServerSocket(port);
			
			//3) 클라이언트로부터 접속요청이 올 때까지 대기
			System.out.println("클라이언트 요청을 기다리고 있습니다.");
			
			//4)연결요청이 오면 , 요청을 수락한 후 클라이언트와 통신할 수 있는 서버측 소켓객체를 생성.
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함....");
			
			
			//5)클라이언트와 입출력 기반스트림 생성(Byte 스트림만 가능하기때문에)
			//보조스트림을 통해 성능개선을 해줘야한다.
			
			//입력용 스트림(클라이언트로부터 전달된 값을 한줄단위로 읽어들이기 위한 입력용 스트림)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//출력용 스트림(클라이언트에게 값을 한 줄 단위로 출력할 수 있는 출력용 스트림)
			pw = new PrintWriter(socket.getOutputStream());
			//PrintWriter : 데이터출력시 print(), println() 메소드를 가지고 있는 보조스트림.
			
			while(true) {
				//7)스트림을 통해서 읽고 쓰기
				String messege = br.readLine();
				System.out.println("클라이언트로부터 전달받은 메세지 : " + messege);
				
				//반대로 클라이언트에게 데이터를 전달해보자
				System.out.print("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage); //클라이언트한테 출력
				pw.flush(); //현재 스트림에 있는 데이터를 강제로 내보내는 메세지
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}

}
