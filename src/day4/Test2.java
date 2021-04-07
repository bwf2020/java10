package day4;


import java.util.Scanner;

import com.Hello2;



public class Test2 {

	public static void main(String[] args) {


		System.out.println(day4.Hello.a);
		
		System.out.println(cn.Hello.a);
		
		System.out.println(com.Hello.a);
		
		System.out.println(Hello2.a);
		
		System.out.println("请输入信息");
		
		Scanner sc=new Scanner(System.in);
		
		//等待用户的输入，输入信息之后回车 ，就往下执行
		String str=sc.nextLine();
		
		System.out.println("用户输入的信息是："+str);
		
		System.out.println("再次请输入信息");
		str=sc.nextLine();
		
		System.out.println("用户输入的信息是："+str);
		
		//释放资源
		sc.close();
		
		System.out.println("结束");
		
		
	


	}

}
