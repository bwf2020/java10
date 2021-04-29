package day20;

public class Test8 implements Runnable{
	
	static int sum=0;

	public static void main(String[] args) {


		Test8 target=new Test8();
		
		Thread t1=new Thread(target);
		
		
		t1.start();
		
		System.out.println("×ÜºÍ£º"+sum);
		
		

	}

	@Override
	public void run() {


		for (int i = 0; i < 10; i++) {
			
			sum++;

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
