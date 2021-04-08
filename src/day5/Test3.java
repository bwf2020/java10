package day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {


		boolean flag=true;
		
		if(flag==true) {
			
			System.out.println("正确的");
			
		}
		
		if(flag) {
			
			System.out.println("正确的2");
			
		}
		
		int a=1;
		
		if(a==2) {
			
			System.out.println("正确的3");
		}
		
		
		Scanner sc=new Scanner(System.in);
		
		String num=sc.nextLine();
		
		int num2=Integer.parseInt(num);
		
		
		/*if(num2>0) {
			
			
			System.out.println("是正数");
		}else if(num2==0) {
			
			System.out.println("是零");
		}else {
			
			
			System.out.println("是负数");
		}*/
		
		
		if(num2>0) {
			
			System.out.println("是正数");
			
		}else {
			
			if(num2==0) {
				
				System.out.println("是零");
			}else {
				
				System.out.println("是负数");
			}
			
		}

	}

}
