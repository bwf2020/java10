package day6;

public class Test6 {

	
	
	
	public static void m1(int i) {
		
		System.out.println("传入的是值:"+i);
		
		i++;
		
		System.out.println("修改后的值:"+i);
		
	}
	
	
	public static void m2(int[] i) {
		
		System.out.println("传入的是值:"+i[0]);
		
		i[0]++;
		
		System.out.println("修改后的值:"+i[0]);
		
	}
	
	
	public static void main(String[] args) {


		
		
		int a=100;
		int[] b= {100};
		
		System.out.println("原始的值："+a);//100
		m1(a);
		System.out.println("调之后的值："+a);//101?
		
		
		System.out.println("原始的值："+b[0]);//100
		m2(b);
		System.out.println("调之后的值："+b[0]);//101?

	}

}
