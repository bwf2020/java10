package day11;

public class Test5 {

	public static void main(String[] args) {


		B b1=new B();
		
		B b2=new B();
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1==b2);
		
		b1.name="bwf";
		b2.name="bwf2";
		
		
		System.out.println(b1==b2);
		
		
		System.out.println(b1.equals(b2));
		
		String str1=new String("bwf");
		String str2=new String("bwf");
		
		System.out.println(str1==str2);
		
		System.out.println(str1.equals(str2));
		
		System.out.println(b1.equals(b2));

	}

}
