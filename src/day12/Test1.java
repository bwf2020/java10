package day12;

public class Test1 {

	
	
	public static void show1(int a) {
		
		
		System.out.println(a);
	}
	
	public static void show2(User user) {
		
		
		System.out.println(user);
		System.out.println(user.a);
	}
	
	
	public static void main(String[] args) {


		int x=100;
		show1(x);
		
		
		show1(200);
		
		User u=new User();
		show2(u);
		
		show2(new User());
		
		int y;
		
		show1(300);
		
		
		

	}

}
