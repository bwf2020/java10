package day8;

public class Test4 {

	public static void main(String[] args) {


		
		
		int a=100;
		
		Integer b=new Integer(200);
		
		System.out.println(a);
		System.out.println(b);
		
		Integer c=a;//装箱 ，把基本类型装箱成包装
		System.out.println(c);
		
		Integer d=new Integer(a);
		System.out.println(d);
		
		int e=new Integer(300);//拆箱  把对象拆成基本类型使用
		System.out.println(e);
		
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		
		
		System.out.println(Integer.parseInt("10")+1);
		
		System.out.println(Integer.SIZE);
		
		System.out.println(Integer.compare(3, 2));
		 
		 
		System.out.println(Integer.toBinaryString(8956));
		System.out.println(Integer.toHexString(8956));
		System.out.println(Integer.toOctalString(8956));
		
		System.out.println(Integer.toString(8956)+1);
		
		Integer d2=Integer.valueOf("100");//把字符串转数字对象，对象拆箱成基本类型
		System.out.println(d2+1);
		
		int d3=100;
		
		int d4=d2.intValue();
		System.out.println(d4);
		int d5=d2;
		System.out.println(d5);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.reverse(1));
		
		
	
		
		
		
	}

}
