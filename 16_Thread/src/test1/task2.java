package test1;

public class task2 extends Thread{
	public void run() {
			for(int i = 0; i < 20 ; i++) {
				 if(i % 2 !=0) {
					 System.out.println(i + "홀수링");
				 }
			}
	}
}

