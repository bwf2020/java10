package day6;

public class Test5 {

	
	
	public static double getArea(double width,double height) {
		
		
		return width*height;
		
	}
	
	public static void m1(int a) {
		
		System.out.println("m1");
	}

	
	public static void m2(int a) {
		
		System.out.println("m2");
	}
	
	public static void m3(String name) {
		
		System.out.println("m3");
	}
	
	public static void m1(String a) {
		
		System.out.println("m1 �ַ�������");
	}
	
	public static void m1(int a,int b) {
		
		System.out.println("m1 ��������");
	}
	
	public static void m1(int a,String b) {
		
		System.out.println("m1 �������� ���Ͳ�һ��");
	}
	public static void m1(String b,int a) {
		
		System.out.println("m1 �������� ���Ͳ�һ��");
	}
	
	
	
	public static void m4(int... a) {
		
		
		System.out.println("�ɱ������"+a.length);
		
	}
	
	public static void m5(int[] a) {
		
		
		System.out.println("�̶�������"+a);
		
	}
	
	
	public static void m6(int a,int...b) {
		
		
		System.out.println("�ɱ������"+a+b.length);
		
	}
	
	public static void main(String[] args) {


		System.out.println(getArea(30.5, 20));
		
		
		m1(100);
		m1("bwf");
		m1(1,2);
		
		m2(200);
		m3("200");
		
		m4();
		
		int[] array= {1,2};
		m5(array);
		
		m4(1);
		m4(1,2,3,4,5,6);
		
		m6(10,1,2,3,4,5);
		
		m4(array);
		
		
		
		
		
	}

}
