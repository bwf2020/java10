package day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {


		boolean flag=true;
		
		if(flag==true) {
			
			System.out.println("��ȷ��");
			
		}
		
		if(flag) {
			
			System.out.println("��ȷ��2");
			
		}
		
		int a=1;
		
		if(a==2) {
			
			System.out.println("��ȷ��3");
		}
		
		
		Scanner sc=new Scanner(System.in);
		
		String num=sc.nextLine();
		
		int num2=Integer.parseInt(num);
		
		
		/*if(num2>0) {
			
			
			System.out.println("������");
		}else if(num2==0) {
			
			System.out.println("����");
		}else {
			
			
			System.out.println("�Ǹ���");
		}*/
		
		
		if(num2>0) {
			
			System.out.println("������");
			
		}else {
			
			if(num2==0) {
				
				System.out.println("����");
			}else {
				
				System.out.println("�Ǹ���");
			}
			
		}

	}

}
