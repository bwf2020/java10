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
		

		System.out.println("=========��ӭ������Ϊ�峬��========");

		System.out.println("1.������Ʒ\t2.����");

		Scanner sc = new Scanner(System.in);
		
		boolean flag=true;
		int index=0;

		while (flag) {
		
			System.out.println("����������1/2");
			
			//�����������������
			
			switch (sc.nextLine()) {
			case "1":
				
				System.out.println("��������Ʒ����");
				String name=sc.nextLine();
				
				System.out.println("�����뵥��");
				String price=sc.nextLine();
				float price2=Float.parseFloat(price);
				
				System.out.println("����������");
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
		
		//����
		
		//�ж�
		if(index==0) {
			
			System.out.println("=======��û��ѡ����Ʒ�����´�����========");
			return;
		}
		
		System.out.println("����\t����\t����\tС��");
		
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
		
		System.out.println("�����ۿ�");

		String zk=sc.nextLine();
		int zk2=Integer.parseInt(zk);
		
		float realPrice=allPrice*zk2/10;
		System.out.println("ԭ�ۣ�"+allPrice);
		System.out.println("ʵ�ʸ��"+realPrice);
		
		System.out.println("�����븶����");
		
		String money=sc.nextLine();
		float money2=Float.parseFloat(money);
		
		System.out.println("���㣺"+(money2-realPrice));
		
		System.out.println("=======��ӭ�´�����========");
		
	}

}
