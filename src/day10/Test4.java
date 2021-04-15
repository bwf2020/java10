package day10;

public class Test4 {

	public static void main(String[] args) {


		User user=new User();
		
		user.setId(110);
		
		System.out.println(user.getId());
		
		System.out.println(user.getName());
		
		User user2=new User();
		System.out.println(user2.getName());
		
		user.setAge(20);
		
		
	}

}
