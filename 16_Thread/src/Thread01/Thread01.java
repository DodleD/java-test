package Thread01;

public class Thread01 {
	/*
	 * 쓰레드 : 프로그램 내에서 실행의 흐름을 가지고 있는 최소 단위.
	 * main 메소드 실행시 메인쓰레드가 실행되는 것이다.
	 */

	public static void main(String[] args) {
		Runnable task = new myRunable();
		task t2 = new task();
		Thread t =new Thread(task);
		
		t.start();
		t2.start();
		System.out.println("End : " + Thread.currentThread().getName());
	}

}
