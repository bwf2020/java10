package day21;

public class Counter2 {

	
	
	private final static Object lockA=new Object();
	private final static Object lockB=new Object();
	
	
	
	
	
	public void add(int m) {
		
	    synchronized(lockA) { // ���lockA����
	     
	    	System.out.println(Thread.currentThread().getName()+"�õ��ˣ�A��");
	        try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        synchronized(lockB) { // ���lockB����
	        	System.out.println(Thread.currentThread().getName()+"�õ��ˣ�B��");
	        } // �ͷ�lockB����
	    } // �ͷ�lockA����
	}
	
	
     public void sub(int m) {
		
	    synchronized(lockA) { // ���lockB����
	    	System.out.println(Thread.currentThread().getName()+"�õ��ˣ�B��");
	        try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        synchronized(lockB) { // ���lockA����
	        	System.out.println(Thread.currentThread().getName()+"�õ��ˣ�A��");
	        } // �ͷ�lockA����
	    } // �ͷ�lockB����
	}
	


}
