package day21;

public class Test4 extends Thread{

	public static void main(String[] args) {


		
		Test5 t=new Test5();
		t.setDaemon(true);
		t.start();
		
		
		for (int i = 0; i < 20; i++) {
			
			Test4 t2=new Test4();
			t2.start();
			
		}
		
		
		

	}

	@Override
	public void run() {


		for(int i=0;i<10;i++) {
			
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}

class Test5 extends Thread{
	
	@Override
	public void run() {


		while(true) {
			
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getThreadGroup().activeCount());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
