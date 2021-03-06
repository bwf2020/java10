package day21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test13 {

	public static void main(String[] args) {


		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 6; i++) {
		    final int index = i;
		    singleThreadExecutor.execute(new Runnable() {
		        @Override
		        public void run() {
		            try {
		                System.out.println(index+":"+
		                		Thread.currentThread().getName());
		                Thread.sleep(2000);
		            } catch (InterruptedException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            }
		        }
		    });
		}
		singleThreadExecutor.shutdown();
		
	}

}
