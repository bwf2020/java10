package day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {


		
		
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("�������û���");
		
		String name= sc.nextLine();
		
		if(name.length()==0) {
			
			name=null;
		}
		
		
		System.out.println("����������");
		
		
		String pwd= sc.nextLine();
		
		//����׳��
		if("admin".equals(name)&&"123".equals(pwd)) {
			
			System.out.println("����ϵͳ");
		}else {
			
			System.out.println("�˺ź��������");
			
		}
		
	}

}
