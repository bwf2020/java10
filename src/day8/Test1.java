package day8;

public class Test1 {
	
	
	
		int a;
		long b;
		boolean c;
		float d;
		
		int e=100;
		static int f=100;
	
		public  Test1() {
			
			System.out.println("无参的构造函数");
		}
		
		public Test1(int a) {
			
			System.out.println("带有参数的构造函数:"+a);
		}
		
		public Test1(String a) {
			
			System.out.println("带有字符串参数的构造函数:"+a);
			
		}
		
		public Test1(int a1,long b1,boolean c1,float d1) {
			
			System.out.println("带有参数初始化的构造函数");
			a=a1;
			b=b1;
			c=c1;
			d=d1;
		}

		public static void main(String[] args) {
	
			
			//开辟空间，并且调用的是一个无参的构造函数
			Test1 t1=new Test1();
			
			System.out.println("内存地址:"+t1);
			
			//直接调用普通函数
			//t1.Test1();
			
			t1=new Test1(100);
			System.out.println("内存地址:"+t1);
			
			t1=new Test1("hello");
			System.out.println("内存地址:"+t1);
			
			
			int a=100;
			
			
			System.out.println(a);
			System.out.println(t1.a);//上面没有初始化，是不能被调用的？
			System.out.println(t1.b);
			System.out.println(t1.c);
			System.out.println(t1.d);
		
			
			t1=new Test1(100, 10L, true,10F);
			System.out.println("内存地址:"+t1);
			
			
			System.out.println(t1.a);//通过构造函数初始化属性值
			System.out.println(t1.b);
			System.out.println(t1.c);
			System.out.println(t1.d);
			
			Test1 t2=new Test1();
			System.out.println(t2.e);
			System.out.println(t2.f);
			
			
			Test1 t3=new Test1();
			System.out.println(t3.e);
			System.out.println(t3.f);
	
			t2.e=200;
			System.out.println(t2.e);	
			System.out.println(t3.e);	
					
			t2.f=500;
			System.out.println(t2.f);	
			System.out.println(t3.f);
			
			System.out.println(Test1.f);
			
		}
		
		
		public void show1() {
			
			int a=100;//局部变量等到方法结束，那么就会销毁
			
		}

}


