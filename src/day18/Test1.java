package day18;

import java.util.Scanner;

import day18.entity.User;

public class Test1 {

	public static void main(String[] args) throws Exception {


		//��̬ʵ����
		User u1=new User();
		
		System.out.println(u1);
		
		//��̬ʵ����
		Class userClass=Class.forName("day18.User");
		System.out.println(userClass);
		User u2=(User) userClass.newInstance();
		System.out.println(u2);
		
		//�����û�������ʵ��������
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("������Ҫʵ�������������");
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
