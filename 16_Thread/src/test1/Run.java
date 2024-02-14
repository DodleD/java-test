package test1;

public class Run {
	public static void main(String[] args) {
		task1 t1 = new task1();
		task2 t2 = new task2();
		
		t1.start();
		t2.start();
	}
	
	
	public static class task1 extends Thread{
		public void run() {
				for(int i = 0; i < 20 ; i++) {
					 if(i % 2 ==0) {
						 System.out.println("task 1 : " + i + "짝수");
					 }
				}
		}
	}
	
	
	public static class task2 extends Thread{
		public void run() {
				for(int i = 0; i < 20 ; i++) {
					 if(i % 2 !=0) {
						 System.out.println("task 2 : " + i + "홀수");
					 }
				}
		}
	}

}
