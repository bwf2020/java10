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
		System.out.println("�ڼ��Σ�������:"+num);
		
	}
	
	public static void main(String[] args) {


		show();

	}

}
