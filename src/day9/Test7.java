package day9;

public class Test7 {

	
	public static void m1(IA  a) {
		
		
		a.show1();
		a.show2();
		
		
		
	}
	
	public static void main(String[] args) {


		System.out.println(IA.a);
		System.out.println(IA.b);
		
		
		A3 a=new A3();
		A4 a1=new A4();
	
		m1(a1);
		
		
		
		IBase base=new A7();
		base.show1();
		base.show2();
		
		IBase.show3();
		

	}

}
