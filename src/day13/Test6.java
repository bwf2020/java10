package day13;

public class Test6 {

	
	static int num=0;
	
	public static void show() {
		
		num++;
		System.out.println("show......"+num);
		
		if(num==10) {
			return;
		}
		show();
		num--;
		System.out.println("第几次，结束了:"+num);
		
	}
	
	public static void main(String[] args) {


		show();

	}

}
