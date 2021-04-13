package day8;

class A{
	
	int a;
}

public class Test3 {

	
	
	public void show(int a) {
		
		a++;
		System.out.println("改变之后:"+a);
		
		
	}
	
	public void show(Integer b) {
		
		b=b.intValue()+1;
		System.out.println("改变之后:"+b.intValue());
		
		
	}
	
	public void show(A a) {
		
		a.a++;
		System.out.println("改变之后:"+a.a);
	}
	
	
	public static void main(String[] args) {


		
		int a=1;
		Integer b=new Integer(1);
		
		Test3 t=new Test3();
		
		t.show(a);
		
		System.out.println(a);
		
		

		t.show(b);
		System.out.println(b);
		
		A a1=new A();
		a1.a=1;
		t.show(a1);
		System.out.println(a1.a);
		
		
		

	}

}
