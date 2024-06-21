package day19.thread.basic;

public class MainClass2 {
	
	public static void main(String[] args) {
		
		// 객체 1개, 쓰레드 2개 동시에
		
		MyThread m1 = new MyThread();
		 
		Thread thread1 = new Thread(m1, "쓰레드명 A");
		Thread thread2 = new Thread(m1, "쓰레드명 B");
		
		thread1.start();
		thread2.start();
		
		System.out.println("main 쓰레드 정상종료");
		
	}

}
