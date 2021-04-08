package day5;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.登录 \t 2.退出");

		String flag = sc.nextLine();

		switch (flag) {
		case "1":
			System.out.println("输入用户名");
			String name=sc.nextLine();
			
			System.out.println("输入密码");
			String pwd=sc.nextLine();
			
			if("admin".equals(name)&&"123".equals(pwd)) {
				
				System.out.println("===欢迎来到博为峰===");
			}
			
			
			break;
		case "2":

			System.out.println("===成功退出===");
			System.exit(0);
			
			break;
		default:
			System.out.println("===指令有误===");
			break;
		}

	}

}
