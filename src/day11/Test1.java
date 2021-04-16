package day11;

public class Test1 {

	
	
	private static int a=100;
	
	public static void m1(IUser user) {
		
		user.show1();
	}
	
	public static void main(String[] args) {


	/*	IUser user=new User();
		
		m1(user);*/
		
		
		m1(new IUser() {
			
			
			  public void show1() {
				
				  
				  System.out.println("show1方法");
				
			}
			  
		});
		
		
		m1(new IUser() {
			
			
			  public void show1() {
				
				  
				  System.out.println("show1方法其他功能"+a);
				
			}
			  
		});
		

	
		
		

	}

}
