package day6;

import java.util.Scanner;

public class Test2 {
	
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {


		System.out.println("main方法开始");
		sc.nextLine();
		
		m1();
		
		sc.nextLine();
		System.out.println("main方法结束");

	}
	
	
	public static void m1() {
		
		System.out.println("m1方法开始");
		
		sc.nextLine();
		
		m2();
		
		sc.nextLine();
		
		System.out.println("m1方法结束");
		
		
	}
	
	
	public static void m2() {
		
		System.out.println("m2方法开始");
		
		sc.nextLine();
		
		System.out.println("m2方法结束");
		
		
	}

}
