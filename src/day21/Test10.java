package day21;

public class Test10 {

	public static void main(String[] args) {


		WareHouse wh=new WareHouse();
		
		Thread t1=new Thread(()->{
			
			while(true) {
				
				wh.put();
				
			}
			
		});
		
		
	Thread t2=new Thread(()->{
			
			while(true) {
				
				wh.get();
				
			}
			
		});
	
	t1.start();
	t2.start();
		

	}

}
