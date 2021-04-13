package day8;

public class Test5 {

	
	
	
	int a=1;
	int b=1;
	
	static int c=1;
	
	
	public Test5(int a) {
		
		System.out.println("a的值："+a);
		//this就是t
		this.a=a+10*1+1-2;
		
	}
	
	public Test5(int a,int b) {
	
		this(a);
		this.b=b;
		
		
	}
	
	
	public void show1() {
		
		
		System.out.println(this);
		System.out.println(c);
		
	}
	
	public static void show2() {
		
		
		//System.out.println(this);
		
	}
	
	public static void main(String[] args) {


		//当前对象是t
		/*Test5 t=new Test5(2);
		
		System.out.println(t.a);*/
		
		
		
		Test5 t=new Test5(2,5);
		System.out.println(t.a);
		System.out.println(t.b);
		
		System.out.println(t);
		t.show1();

		
		
		Test5.show2();
		
		
		System.out.println("==============");

	
		int a=10;
		int b=10;
		
		System.out.println(a==b);
		
		User u1=new User("zhangsan");
		User u2=new User("zhangsan");
		
		System.out.println(u1==u2);
		System.out.println(u1);
		System.out.println(u2);
		
		Integer c=new Integer(10);
		System.out.println(a==c);
		
		Integer d=new Integer(10);
		System.out.println(d==c);
		
	
	
	
	}

}
