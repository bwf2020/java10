package day21;

public class Test8 {
	
	

	public static void main(String[] args) throws InterruptedException {

		
		Counter counter=new Counter();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {

				counter.add(10);
				
			}
		});
		
		Thread t2=new Thread(()->{
			
			    counter.sub(10);
			
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("ʣ�ࣺ"+counter.get());
		

	}

}
