package day20;

public class Test7 extends Thread{

	public static void main(String[] args) {

		
		new Test7().start();
		new Test7().start();

		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		

	}

	@Override
	public void run() {


		
		while(true) {
		
		System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		
		
	}
	
	
	

}
