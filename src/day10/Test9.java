package day10;



public class Test9 {

	public static void main(String[] args) {


		
		Inner inner1=new Inner();
		inner1.show();
		
		Outer outer=new Outer();
		
		
		day10.Outer.Inner inner2=outer.new Inner();
		inner2.show();
		
		day10.Outer.Inner2 inner22=new Outer.Inner2();
		inner22.show();
		System.out.println(inner22.b2);
		System.out.println(Outer.Inner2.b2);
		
		
		

	}

}

