package day21;

public class Test9 {
	
	

	public static void main(String[] args) {


		Counter2 c1 = new Counter2();
		// ��c1���в������߳�:
		Thread t1=new Thread(() -> {
		    c1.add(10);
		});
		t1.start();
		
		Thread t2=new Thread(() -> {
			 c1.sub(10);
		});
		t2.start();
		

	}

}
