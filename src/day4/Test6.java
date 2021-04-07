package day4;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		
		
		
		String a="100";
		
		//int b=(int)a;
		
		Integer b=new Integer(100);
		
		System.out.println(b);
		
		int b2=100;
		System.out.println(b2);
		
		//把数字转化为字符串了
		System.out.println(Integer.toBinaryString(9)); 
		
		//把数字串转化为字符串 不同类型之间的转换
		String str=Integer.toBinaryString(9);
		System.out.println(str);
		
		String str2=Integer.toString(9);
		System.out.println(str2);
		
		//把字符串转化为数字  实现不同类型之间的转化
		Integer num= Integer.parseInt(a);
		System.out.println(num*2);
		
		Integer num2= Integer.parseInt(a,2);
		System.out.println(num2);
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入年龄");
		
		/*String age=sc.nextLine();
		
		//功能实现，周岁，加1 
		
		int age2=Integer.parseInt(age);
		age2++;
		
		System.out.println("你输入的年龄是:"+age2);*/
		
		int age=sc.nextInt();
		age++;
		
		System.out.println("你输入的年龄是:"+age);
		
	}

}
