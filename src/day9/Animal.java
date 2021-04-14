package day9;

public  class Animal{

	
	
	String name="动物名字";
	int age;
	char sex;
	
	static String str="bwf";
	
	static {
		
		System.out.println("动物类静态语句块");
		
	}
	

	
	public Animal() {
		
		System.out.println("父类的无参的构造函数");
	}
	
	public Animal(String name) {
		
		this.name=name;
		System.out.println("父类的name参的构造函数");
	}
	
	
	public void show1() {
		
		System.out.println("动物方法1");
	}
	
	public final int show2() {
		
		System.out.println("动物方法2");
		return 0;
	}
	
	
}
