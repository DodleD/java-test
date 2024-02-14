package com.kh.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serserver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		int port = 3000;
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			
			System.out.println("클라대기");
			
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + " 가 연결을 요청했습니다.");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			pw = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String message = br.readLine();
				System.out.println("클라이언트로부터 온 메세지 : " + message);
				
				System.out.println("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.next();
				pw.write(sendMessage);
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.close();
		}
		sc.close();
	}
	
}
