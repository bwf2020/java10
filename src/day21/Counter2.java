package day21;

public class Counter2 {

	
	
	private final static Object lockA=new Object();
	private final static Object lockB=new Object();
	
	
	
	
	
	public void add(int m) {
		
	    synchronized(lockA) { // 获得lockA的锁
	     
	    	System.out.println(Thread.currentThread().getName()+"拿到了：A锁");
	        try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        synchronized(lockB) { // 获得lockB的锁
	        	System.out.println(Thread.currentThread().getName()+"拿到了：B锁");
	        } // 释放lockB的锁
	    } // 释放lockA的锁
	}
	
	
     public void sub(int m) {
		
	    synchronized(lockA) { // 获得lockB的锁
	    	System.out.println(Thread.currentThread().getName()+"拿到了：B锁");
	        try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        synchronized(lockB) { // 获得lockA的锁
	        	System.out.println(Thread.currentThread().getName()+"拿到了：A锁");
	        } // 释放lockA的锁
	    } // 释放lockB的锁
	}
	


}
