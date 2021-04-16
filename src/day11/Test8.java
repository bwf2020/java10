package day11;

import java.util.Scanner;

public class Test8 {
	
	
	
	
	public void show(int a) throws Exception{
		


		/*if(a==0) {
			
			
			try {
				throw new Exception("发生异常了");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}*/
		

		System.out.println(1/0);
		
		/*if(a==0) {
			
			
			throw new Exception("发生异常了");
			
			
		}*/
		
		
	}

	public static void main(String[] args)  {


		
		Test8 t=new Test8();
		
	
	
		try {
		t.show(0);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		System.out.println("结束");
		
		

	}

}
