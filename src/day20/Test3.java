package day20;

public class Test3 {

	public static void main(String[] args) {


		IA a=new IA() {
			
			@Override
			public void show1(int a) {

				System.out.println("�����ڲ��෽ʽ"+a);
				
			}
		};
		
		a.show1(200);
		
		IA b=(c)->{
			
			System.out.println("����ʽ���"+c);
		};
		
		b.show1(300);

	}

}
