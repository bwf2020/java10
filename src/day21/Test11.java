package day21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test11 {

	public static void main(String[] args) {


		ExecutorService executor=Executors.newCachedThreadPool();
		
		
		for (int i = 0; i < 100; i++) {
			
	
		
		executor.execute(new Runnable() {
			
			@Override
			public void run() {


				 try {
				    	Thread.sleep(100);
				    } catch (InterruptedException e) {
				        e.printStackTrace();
				    }
		            System.out.println("t1:"+Thread.currentThread().getName());
		            
		            
		            try {
				    	Thread.sleep(5000);
				    } catch (InterruptedException e) {
				        e.printStackTrace();
				    }
				
				
			}
		});
		
		}
		
		 try {
		    	Thread.sleep(0);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		
		 
		 executor.execute(new Runnable() {
		        @Override
		        public void run(){ 
		            System.out.println("t2:"+Thread.currentThread().getName());
		        }
		    });
		 
		 
		 
		 executor.shutdown();
		
		
		
	}

}
