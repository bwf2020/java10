package day10;

public class Student {

	
	private static Student stu;
	
	private Student() {
		
		System.out.println("˽�еĹ��캯��");
	}
	
	public static Student getInstance() {
		
		if(stu==null) {
			
			stu=new Student();

		}
		
		return stu;
		
	}
	
	
}
