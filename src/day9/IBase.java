package day9;

public interface IBase {

	
	void show1();
	
	
	default void show2() {
		
		System.out.println("show2");
		
	}
	
	static void show3() {
		
		System.out.println("show3");
	}
}
