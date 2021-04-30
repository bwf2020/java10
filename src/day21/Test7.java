package day21;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test7{

	public static void main(String[] args) {


		
		TestLock testLock=new TestLock();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {

				testLock.testLock(Thread.currentThread());
			}
		},"线程1");
		
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {

				testLock.testLock(Thread.currentThread());
			}
		},"线程2");
		
		t1.start();
		t2.start();
		

	}

}


class TestLock{
	
	
	private Lock lock=new ReentrantLock();

	
	public void testLock(Thread thread) {
		
		
		try {
			lock.lock();
			//lock.tryLock(1000, TimeUnit.MILLISECONDS);
			
			
			System.out.println(thread.getName());
			Thread.sleep(2000);
			
		}catch (Exception e) {
			System.out.println(thread.getName() + "发生了异常释放锁");
		}finally {
			//lock.unlock();
		}
		
	}
	
	
}
