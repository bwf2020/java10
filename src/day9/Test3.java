package day9;

public class Test3 {
	
	
	
	public static void m1(A1 a) {
		
		a.show1();
		a.show2();
		
	}
	
	public static void m1(A2 a) {
		
		a.show1();
		a.show2();
		
	}
	
	
	public static void m2(A a) {
		
		a.show1();
		a.show2();
		
	}
	
	

	public static void main(String[] args) {


		//A a=new A();
		
		/*A1 a1=new A1();
		
		a1.show1();
		a1.show2();
		
		A2 a2=new A2();
		a2.show1();
		a2.show2();*/
		
		
	/*	A1 a1=new A1();
		m1(a1);*/
		
		
	/*	A2 a2=new A2();
		m1(a2);*/
		
		A2 a2=new A2();
		A1 a1=new A1();
		
		m2(a1);
		m2(a2);
		
		
		
	

	}

}
