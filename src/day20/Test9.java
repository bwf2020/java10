package day20;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


public class Test9 implements Callable<Integer>{

	public static void main(String[] args) throws InterruptedException, ExecutionException {


		Test9 test9=new Test9();
		
		FutureTask<Integer> future=new FutureTask<Integer>(test9);
		
		Thread t1=new Thread(future);
		
		t1.start();
		
		System.out.println("主线程在执行");
		int sum=future.get();
		System.out.println("总和："+sum);

	}

	@Override
	public Integer call() throws Exception {

		int sum=0;
		
		for (int i = 0; i < 10; i++) {
			
			if(i%2==0) {
				
				Thread.sleep(1);
			}
			
			System.out.println(i);
			sum+=i;
			
		}

		return sum;
	}

}
