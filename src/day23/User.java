package day23;

public class User {

	
	public User() {
		
		
		System.out.println("构造用户对象");
		
	}
	
	public int id=100;
	private String name="bwf";
	
	public boolean flag=true;
	private char sex='男';
	
	
	public String getName() {
		return name;
	}
	
	
	public void m1() {
		
		System.out.println("方法1");
	}
	
	public String m2() {
		
		System.out.println("方法2");
		return "bwf";
	}
	
	public String m3(String name,int id) {
		

		System.out.println("方法3");
		return name.toUpperCase();
	}
	
	
	public static void m4() {
		
		System.out.println("方法4");
		
	}
	
	
	
}
