package day6;

public class Test3 {

	
	
	public static void m1() {
		
		
		System.out.println("m1方法");
	}
	

	public  void m2() {
		
		
		System.out.println("m2方法");
		
	}
	
	
	private static void m3() {
		
		System.out.println("m3方法");
	}
	
	
	public static int m4() {
		
		System.out.println("m4方法");
		return 100;
		
		
	}
	
	public static String m5() {
		System.out.println("m5方法");
		return "bwf";
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		m1();
		
		//m2();
		
		Test3 t=new Test3();
		
		t.m2();
		
		System.out.println("=============");
		
		Test4.m1();
		
		Test4 t4=new Test4();
		
		t4.m1();
		t4.m2();
		
		System.out.println("=============");
		
		m3();
		
		//Test4.m3();
		
		System.out.println("=============");
		
		m4();
		m5();
		
		
		int a=m4();
		String b=m5();
		
		
		System.out.println(a);
		
		System.out.println(b);
		
	}
}
