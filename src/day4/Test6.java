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
		
		//������ת��Ϊ�ַ�����
		System.out.println(Integer.toBinaryString(9)); 
		
		//�����ִ�ת��Ϊ�ַ��� ��ͬ����֮���ת��
		String str=Integer.toBinaryString(9);
		System.out.println(str);
		
		String str2=Integer.toString(9);
		System.out.println(str2);
		
		//���ַ���ת��Ϊ����  ʵ�ֲ�ͬ����֮���ת��
		Integer num= Integer.parseInt(a);
		System.out.println(num*2);
		
		Integer num2= Integer.parseInt(a,2);
		System.out.println(num2);
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("����������");
		
		/*String age=sc.nextLine();
		
		//����ʵ�֣����꣬��1 
		
		int age2=Integer.parseInt(age);
		age2++;
		
		System.out.println("�������������:"+age2);*/
		
		int age=sc.nextInt();
		age++;
		
		System.out.println("�������������:"+age);
		
	}

}
