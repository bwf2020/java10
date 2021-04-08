package day5;

public class Test1 {

	public static void main(String[] args) {


		System.out.println(~2);
		System.out.println(~3);
		System.out.println(~4);
		
		System.out.println(~100);
		
		int a; //定义
		
		a=100;  //赋值
		
		
		int[] b;//定义，还没有开辟
		
		b=new int[5];
		
		System.out.println(b);
		
		float[] c=new float[3];
		
		System.out.println(c);
		
		short[] d=new short[] {1,20,33};
		
		System.out.println(d);
		
		
		byte[] e= {20,50,89};
		
		System.out.println(e);

		System.out.println(b);
		
		//给b空的赋值
		b[0]=100;
		b[2]=300;
		System.out.println(b);
		
		//b[5]=500;
		
		//b[4]=3.14;
		
		System.out.println(b);
		
		//获取数组值
		System.out.println(b[0]);
		System.out.println(b[5]);//终止了
		
		System.out.println("结束");
		
		

	}

}
