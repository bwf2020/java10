package day4;

public class Test5 {

	public static void main(String[] args) {


		char a='a';
		
		char b=65;//高->低
		
		int c=a; //低->高
		
		System.out.println(b);
		
		System.out.println(c);
		
		b=9999;
		
		System.out.println(b);
		
		int e=129;
		byte d=(byte)e;//高->低
		System.out.println(d);
		
		float f=3.14F;
		e=(int) f;
		
		System.out.println(e);
		
		System.out.println(5/2);
		System.out.println(5F/2F);
		
		boolean f1=false;
		//e=(int)f1;不同种类型的，不能强制转换
		
		short g=100;
		e=g;
		
		
		
	}

}
