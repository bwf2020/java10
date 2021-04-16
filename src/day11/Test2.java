package day11;

public class Test2 {

	
	
	public static void m1(IUser user) {
		
		
		System.out.println(user);
		
		
		if(user instanceof User1) {
			
			User1 u1=(User1)user;
			
		}else {
			
			User2 u1=(User2)user;
			
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {


		m1(new User1());
		
		m1(new User2());
		
	}

}
