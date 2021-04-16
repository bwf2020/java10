package day11;

public class Test9 {

	public static void main(String[] args) {


		
		try {
			
			
			throw new MyException("自定义异常");
			
			
		}catch (Exception e) {

			e.printStackTrace();

		}
		
		
		try {
			
			System.out.println("连接网络上的数据库");
	
			if(false) {
				throw new MyException2();
			}else {
				
				System.out.println("数据库连接成功");
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("结束");
		

	}

}
