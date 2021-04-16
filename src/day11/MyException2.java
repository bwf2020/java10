package day11;

public class MyException2 extends Exception{

	@Override
	public void printStackTrace() {

			System.out.println("连接数据库的时候，网络断开");

	}

	
	
	
}
