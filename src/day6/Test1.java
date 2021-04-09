package day6;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		String[] names=new String[1000];
		float[] prices=new float[1000];
		int[] nums=new int[1000];
		float[] xjs=new float[1000];
		
		float allPrice=0f;
		

		System.out.println("=========欢迎来到博为峰超市========");

		System.out.println("1.输入商品\t2.结算");

		Scanner sc = new Scanner(System.in);
		
		boolean flag=true;
		int index=0;

		while (flag) {
		
			System.out.println("继续购买吗？1/2");
			
			//做对数组的数量扩容
			
			switch (sc.nextLine()) {
			case "1":
				
				System.out.println("请输入商品名称");
				String name=sc.nextLine();
				
				System.out.println("请输入单价");
				String price=sc.nextLine();
				float price2=Float.parseFloat(price);
				
				System.out.println("请输入数量");
				String num=sc.nextLine();
				int num2=Integer.parseInt(num);
				
				
				float xj=price2*num2;
				
				allPrice+=xj;
				
				names[index]=name;
				prices[index]=price2;
				nums[index]=num2;
				xjs[index]=xj;
				
				index++;

				break;

			case "2":

				flag=false;
				break;

			default:
				break;
			}

		}
		
		//结算
		
		//判断
		if(index==0) {
			
			System.out.println("=======还没有选好商品，请下次再来========");
			return;
		}
		
		System.out.println("名称\t单价\t数量\t小计");
		
		for (int i = 0; i < index; i++) {
			
			String name = names[i];
			float price=prices[i];
			int num=nums[i];
			float xj=xjs[i];
			
			System.out.print(name);
			System.out.print("\t");
			System.out.print(price);
			System.out.print("\t");
			System.out.print(num);
			System.out.print("\t");
			System.out.println(xj);
		
			
		}
		
		System.out.println("输入折扣");

		String zk=sc.nextLine();
		int zk2=Integer.parseInt(zk);
		
		float realPrice=allPrice*zk2/10;
		System.out.println("原价："+allPrice);
		System.out.println("实际付款："+realPrice);
		
		System.out.println("请输入付款金额");
		
		String money=sc.nextLine();
		float money2=Float.parseFloat(money);
		
		System.out.println("找零："+(money2-realPrice));
		
		System.out.println("=======欢迎下次再来========");
		
	}

}
