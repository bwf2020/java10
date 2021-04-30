package day21;

public class WareHouse {

	
	
	private int count=0;
	
	public synchronized void put() {// 生产产品
		
		count++;
		System.out.println("生产后还有："+count);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if (count>5) {// 商品超过5个等待
			try {
				wait();
			} catch (Exception e) {
			} // 进入等待池
		}
		
		notify();// 通知消费者可以消费
		
		
	}
	
	
	public synchronized void get() {// 消费产品
		
		
		if (count<=1) {// 判断当前是否有产品可以消费
			try {
				wait();
			} catch (Exception e) {
			} // 进入等待池
		}
		
		count--;
		System.out.println("消费后还有："+count);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		notify();// 通知生产者可以生产
		
	}
	
	
	
	
}
