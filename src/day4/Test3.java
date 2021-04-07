package day4;

public class Test3 {
	
	
	//全局
	static int num=200;
	
	
	public static void show() {
		
		//局部
		//int num=100;
		
		System.out.println(num);
		
	}

	
	
	public static void main(String[] args) {


		byte a=100;
		
		short b=200;
		
		int c=300;
		
		long d;
		d=400;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		a=-128;
		System.out.println(a);
		
		
		b=32767;
		System.out.println(b);
		
		
	
		int a1,a2=2,a3=3;
		
		a1=1;//在使用之前赋值 初始化
		
		System.out.println(a1);
		System.out.println(a3);
		
		//局部 重新定义
		//int num=300;
		
		//改变全局的
		num=500;
		
		//用全局的，找局部的 当前函数中
		System.out.println(num);
		
		show();
		
		
	
		

	}

}
