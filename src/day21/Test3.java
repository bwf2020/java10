package day21;

public class Test3 extends Thread{

	@Override
	public void run() {


		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {


		Test3 t=new Test3();
	
		t.setPriority(10);
		System.out.println(t.getPriority());
		t.start();
		
		
		Test3 t2=new Test3();
		
		t2.setPriority(1);
		System.out.println(t2.getPriority());
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
		
	
		
		
	}

}
