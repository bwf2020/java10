package day11;

public class Test7 {

	
	
	public static void m1() {
		
		
		try {
			
			
			System.out.println(1);
			return;
			
		}catch (Exception e) {
			System.out.println(2);
		}finally {
			System.out.println(3);
			
		}
		
	}
	
	
	public static int m2() {
		
		
		try {
			System.out.println(1);
			System.out.println(1/0);
			
			return 1;
			
		}catch (Exception e) {
			
			System.out.println(2);
			
			return 2;
		}finally {
			System.out.println(3);
			return 3;
		}
		
		
		
	}
	
	public static void main(String[] args) {


		m1();
		
		System.out.println(m2());

	}

}
