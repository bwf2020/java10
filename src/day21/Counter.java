package day21;

public class Counter {

	
	private int count = 0;//共享数据
	
	public synchronized  void add(int n) { //同步方法add
		
		
		int num=count+n;
				
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		count = num;

		
		
	}
	
	public synchronized  void sub(int n) { //同步方法sub
		
		
		
		int num=count-n;
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		count = num;
		
	}
	
	public int get() {
		return count;
	}
	
}
