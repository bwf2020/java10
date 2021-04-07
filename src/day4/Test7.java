package day4;

public class Test7 {

	public static void main(String[] args) {


		
		System.out.println("abc"+100);
		
		System.out.println(10+10+"abc"+10+10);
		
		System.out.println(10+10+"abc"+(10+10));
		
		System.out.println(10+(10+"abc")+10+10);
		
		
		
		System.out.println(3&2);
		
		System.out.println(7&2);
		
		
		System.out.println(3|2);
		
		System.out.println(7|2);
		
		System.out.println(~2);
		
		
		System.out.println(2>>2);
		
		System.out.println(2<<2);

		
		System.out.println(2>>1);
		
		System.out.println(2>>>1);
		
		System.out.println(0xffffffea>>24);
		
		System.out.println(64>>32);
		
		System.out.println(3^2);
		
		System.out.println(3^2^3);
		
		int a=100;
		
		int b=200;
		
		a=a^b;
		
		b=a^b;//a^b^b a
		
		a=a^b;//a^b^a^b^b  b
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}

}
