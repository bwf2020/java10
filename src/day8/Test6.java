package day8;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {


		String[] goods= {"����","����"};
		double[] price = {5.0,8.0};
		double money=0;
		double cash=0;
		double discount=8;
//		int[] num= new int[200];
		int num1=0;
		int num2=0;
		String tempa;
		String tempb;
		int t1;
		int t2;
		String name;
		Scanner sc =  new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("��������Ҫѡ������Ʒ(��c�����н���):");
			
			name = sc.nextLine();
			if(name.equals(goods[0]))
			{
				System.out.println("�����빺��������");
				tempa=sc.nextLine();
				t1=Integer.parseInt(tempa);
				num1+=t1;
				
			}
			
			else if(name.equals(goods[1]))
			{
				System.out.println("�����빺��������");
				tempb=sc.nextLine();
				t2=Integer.parseInt(tempb);
				num2+=t2;
				
			}
			
			else if (name.equals("c"))
			{
				break;
			}
			else {
				continue;
			}
		}
			
		
		System.out.println("============�����嵥============");
			if(num1==0&&num2==0)
			{
				System.out.println("����δѡ���κ���Ʒ��");
			}else if(num2==0)
			{
				System.out.println("��Ʒ���ƣ����ף�������"+num1+"��С�ƣ�"+price[0]*num1);
				money=price[0]*num1;
			}else if(num1==0)
			{
				System.out.println("��Ʒ���ƣ����ӣ�������"+num2+"��С�ƣ�"+price[1]*num2);
				money=price[1]*num2;
			}else
			{
				System.out.println("��Ʒ���ƣ����ף�������"+num1+"��С�ƣ�"+price[0]*num1);
				System.out.println("��Ʒ���ƣ����ӣ�������"+num2+"��С�ƣ�"+price[1]*num2);
				money=price[0]*num1+price[1]*num2;
			}
			System.out.println("�ܼƣ�"+money+"��");
			System.out.println("�ۿۣ�"+(int)discount+"��");
			System.out.println("ʵ���ܼۣ�"+money*discount/10+"��");
			
				

	}

}
