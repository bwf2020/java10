package day9;

public class Test5 {

	
	
	final int a=1;
	
	final static int b=2;
	
	public static void main(String[] args) {
		
		
		final int c;
		c=3;
		
		final Test51 t=new Test51();
		
		
		Test5 t2=new Test5();
		
		System.out.println(t2.a);
		System.out.println(Test5.b);
		System.out.println(c);
		System.out.println(t);
		
		//t2.a=4;
		//Test5.b=5;
		//c=6;
		//t=new Test51();
		System.out.println(t.d);
		t.d=8;
		System.out.println(t.d);
		

	}

}

class Test51{
	
	int d=7;
}
