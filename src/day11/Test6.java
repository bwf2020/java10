package day11;

import java.util.Scanner;


public class Test6 {
	
	
	private Test6 t=new Test6();
	
	public void Test6() {
		
		
		System.out.println("���캯��");
		
		
	}
	

	public static void main(String[] args) {


		Scanner sc=null;
		
		while(true) {
			
			sc=new Scanner(System.in);
			
			System.out.println("������һ������");
			
			String n=sc.nextLine();
			
			try {
			
			int num=Integer.parseInt(n);
			if(num==0) {
				
				break;
			}
			if(num==1) {
				
				String name=null;
				System.out.println(name.charAt(0));
			}
			if(num==2) {
				
				int[] a= {};
				System.out.println(a[0]);
			}
			
			System.out.println("��������ǣ�"+num);
			
			}catch (Exception e) {

				System.out.println("������������������");
			}finally {
				
			
				System.out.println("�ر�");
			}
			
			
			
			
		}
		
		sc.close();
		

	}

}
