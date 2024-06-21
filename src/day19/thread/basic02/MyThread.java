package day19.thread.basic02;

public class MyThread extends Thread {

	private int num;
	
	@Override
	public synchronized void run() {
		
		for(int i = 1; i <= 10; i++) {
			num++; // 10번 증가
			
			System.out.println(Thread.currentThread().getName() + ":" + num); // 현재 쓰레드의 이름
			
			try {
				
				if(Thread.currentThread().getName().equals("쓰레드명 A")) {
					Thread.sleep(1000); // 쓰레드 1초 멈춤
				} else {
					Thread.sleep(500); // 0.5초 멈춤
				}
				
				Thread.sleep(1000); // 스레드 1초 멈춤
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	

}
