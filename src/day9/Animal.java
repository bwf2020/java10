package day9;

public  class Animal{

	
	
	String name="��������";
	int age;
	char sex;
	
	static String str="bwf";
	
	static {
		
		System.out.println("�����ྲ̬����");
		
	}
	

	
	public Animal() {
		
		System.out.println("������޲εĹ��캯��");
	}
	
	public Animal(String name) {
		
		this.name=name;
		System.out.println("�����name�εĹ��캯��");
	}
	
	
	public void show1() {
		
		System.out.println("���﷽��1");
	}
	
	public final int show2() {
		
		System.out.println("���﷽��2");
		return 0;
	}
	
	
}
