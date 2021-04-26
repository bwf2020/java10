package day18;

import java.util.Scanner;

import day18.entity.User;

public class Test1 {

	public static void main(String[] args) throws Exception {


		//静态实例化
		User u1=new User();
		
		System.out.println(u1);
		
		//动态实例化
		Class userClass=Class.forName("day18.User");
		System.out.println(userClass);
		User u2=(User) userClass.newInstance();
		System.out.println(u2);
		
		//根据用户的输入实例化对象
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("请输入要实例化的类的名字");
		String className=sc.nextLine();
		
		/*if(className.equals("day18.User")) {
			
			User u3=new User();
			System.out.println(u3);
			
		}else if(className.equals("day18.Dog")) {
			
			Dog dog=new Dog();
			System.out.println(dog);
		}*/

		
		Object obj=Class.forName(className).newInstance();
		System.out.println(obj);
		
		}
	}

}
