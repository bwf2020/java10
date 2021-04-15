package day10;

public class Outer {

	private int a=1;
	int b=2;
	protected int c=3;
	public int d=4;
	static int e=5;
	
	public void show() {
		
		Inner inner=new Inner();
		System.out.println(inner.a1);
		inner.show();
		
		Inner2 inner2=new Inner2();
		System.out.println(inner2.a2);
		inner2.show();
		System.out.println(Inner2.b2);


		
	}
	
	
	public class Inner{
		
		
		private int a1=11;
		int b1=22;
		protected int c1=33;
		public int d1=44;
		
		
		public  void show() {
			
			
			System.out.println(this.a1);
			System.out.println(a);
			System.out.println(e);
			System.out.println(Outer.e);
			
		}
		
	}
	
	
	
	public static class Inner2{
		
		
		private int a2=3;
		static int b2=4;
				
		public void show() {
			
			System.out.println(this.b2);
			System.out.println(e);
		
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Outer outer=new Outer();
		outer.show();
		
		
	}
	
	
}
