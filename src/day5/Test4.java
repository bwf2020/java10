package day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {


		
		
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("请输入用户名");
		
		String name= sc.nextLine();
		
		if(name.length()==0) {
			
			name=null;
		}
		
		
		System.out.println("请输入密码");
		
		
		String pwd= sc.nextLine();
		
		//程序健壮性
		if("admin".equals(name)&&"123".equals(pwd)) {
			
			System.out.println("进入系统");
		}else {
			
			System.out.println("账号和密码错误");
			
		}
		
	}

}
