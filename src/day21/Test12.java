package day21;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test12 {

	public static void main(String[] args) {


		ScheduledExecutorService scheduledThreadPool 
		= Executors.newScheduledThreadPool(5);
	scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
		 @Override
			public void run() {
				System.out.println("delay 1 seconds, and excute every 3s");
			}
		}, 1, 3, TimeUnit.SECONDS);
		
		
		scheduledThreadPool.shutdown();
	}

}
