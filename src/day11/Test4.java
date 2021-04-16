package day11;

public class Test4 {
	
	

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		
		System.out.println("对象被清理了");
		
	}

	public static void main(String[] args) {


		Test4 t=new Test4();
		
		System.out.println(t);
		
		t=null;
		
		System.out.println(t);
		
		System.gc();//手动调用垃圾回收机制
		
		System.out.println(t);
		

	}

}
