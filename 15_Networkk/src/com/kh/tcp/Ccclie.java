package com.kh.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ccclie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		Socket socket=null;
		
		int port = 3000;
		
		String serverIP = "localhost";
		
		try {
			socket = new Socket(serverIP, port);
			
			if(socket != null)
				System.out.println("서버와 연결 성공");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	
			pw = new PrintWriter(socket.getOutputStream());
		
			while(true) {
				System.out.println("서버에게 보낼 내용 : ");
				String sendmessage = sc.nextLine();
				
				pw.write(sendmessage);
				pw.flush();
				
				String message = br.readLine();
				System.out.println("서버 메세지 : "+message);
			
			
			
			}
		} catch (IOException e) {
			
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
