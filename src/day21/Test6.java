package day21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test6 {

	
	public static void main(String[] args) {
		
		
		Station station=new Station();
		
		Thread t1=new Thread(station);
		Thread t2=new Thread(station);
		Thread t3=new Thread(station);
		Thread t4=new Thread(station);
		Thread t5=new Thread(station);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	}
	
	
}


class Station implements Runnable{
	
	private int ticket=100;
	//private Object loock=new Object();
	private Lock lock=new ReentrantLock();
	
	
	private  void sale() {
	
		try {
		lock.lock();
			
			/*	synchronized(loock) {*/
					
					if (ticket > 0) {
					
						Thread.sleep(100);
						 
						System.out.println(Thread.currentThread().getName() + ":" + ticket--);
					}
				
				}catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			//}
	}
	

	@Override
	public void run() {

		while (true) {
			
			sale();
			
		}
		
		
	}
	
	
	
}