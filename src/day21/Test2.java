package day21;

public class Test2 extends Thread{

	
	boolean flag=false;
	
	public static void main(String[] args) throws InterruptedException {

		
		Test2 t=new Test2();
		Test2 t2=new Test2();
		Test2 t3=new Test2();
		
		t.start();
		t2.start();
		t3.start();
		
		/*currentThread().sleep(100);

		t.interrupt();*/
		
		currentThread().sleep(10);
		
		t.flag=true;
		

		

	}

	@Override
	public void run() {


		/*while(!isInterrupted()) {
			
			System.out.println(Thread.currentThread().getName());
			
		}*/
		
		while(!flag) {
			
			System.out.println(Thread.currentThread().getName());
			
		}
		
	}
	
	

}
