package day19.thread.basic02;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		
		MyThread m1 = new MyThread();
		m1.setName("쓰레드명 A");
		m1.start();
		
		MyThread m2 = new MyThread();
		m2.setName("쓰레드명 B");
		m2.start();
		
		System.out.println("main 쓰레드 종료");
		
	}

}
  