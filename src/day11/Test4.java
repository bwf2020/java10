package day11;

public class Test4 {
	
	

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		
		System.out.println("����������");
		
	}

	public static void main(String[] args) {


		Test4 t=new Test4();
		
		System.out.println(t);
		
		t=null;
		
		System.out.println(t);
		
		System.gc();//�ֶ������������ջ���
		
		System.out.println(t);
		

	}

}
