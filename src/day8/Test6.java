package day8;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {


		String[] goods= {"手套","袜子"};
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
			System.out.println("请输入您要选购的商品(按c键进行结算):");
			
			name = sc.nextLine();
			if(name.equals(goods[0]))
			{
				System.out.println("请输入购买数量：");
				tempa=sc.nextLine();
				t1=Integer.parseInt(tempa);
				num1+=t1;
				
			}
			
			else if(name.equals(goods[1]))
			{
				System.out.println("请输入购买数量：");
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
			
		
		System.out.println("============结算清单============");
			if(num1==0&&num2==0)
			{
				System.out.println("您还未选购任何商品！");
			}else if(num2==0)
			{
				System.out.println("商品名称：手套，数量："+num1+"，小计："+price[0]*num1);
				money=price[0]*num1;
			}else if(num1==0)
			{
				System.out.println("商品名称：袜子，数量："+num2+"，小计："+price[1]*num2);
				money=price[1]*num2;
			}else
			{
				System.out.println("商品名称：手套，数量："+num1+"，小计："+price[0]*num1);
				System.out.println("商品名称：袜子，数量："+num2+"，小计："+price[1]*num2);
				money=price[0]*num1+price[1]*num2;
			}
			System.out.println("总计："+money+"￥");
			System.out.println("折扣："+(int)discount+"折");
			System.out.println("实际总价："+money*discount/10+"￥");
			
				

	}

}
