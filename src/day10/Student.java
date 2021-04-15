package day10;

public class Student {

	
	private static Student stu;
	
	private Student() {
		
		System.out.println("私有的构造函数");
	}
	
	public static Student getInstance() {
		
		if(stu==null) {
			
			stu=new Student();

		}
		
		return stu;
		
	}
	
	
}
