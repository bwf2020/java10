package day20;

public class Test3 {

	public static void main(String[] args) {


		IA a=new IA() {
			
			@Override
			public void show1(int a) {

				System.out.println("匿名内部类方式"+a);
				
			}
		};
		
		a.show1(200);
		
		IA b=(c)->{
			
			System.out.println("函数式编程"+c);
		};
		
		b.show1(300);

	}

}
