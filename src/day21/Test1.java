package day21;

public class Test1 extends Thread{

	public static void main(String[] args) {


		
		Test1 t=new Test1();
		
		t.start();
		
		try {
			t.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("主线程："+Thread.currentThread().getName());
		

	}

	@Override
	public void run() {


		for (int i = 0; i < 10; i++) {
			
			
			System.out.println("当前的线程："+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
