package day5;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.��¼ \t 2.�˳�");

		String flag = sc.nextLine();

		switch (flag) {
		case "1":
			System.out.println("�����û���");
			String name=sc.nextLine();
			
			System.out.println("��������");
			String pwd=sc.nextLine();
			
			if("admin".equals(name)&&"123".equals(pwd)) {
				
				System.out.println("===��ӭ������Ϊ��===");
			}
			
			
			break;
		case "2":

			System.out.println("===�ɹ��˳�===");
			System.exit(0);
			
			break;
		default:
			System.out.println("===ָ������===");
			break;
		}

	}

}
