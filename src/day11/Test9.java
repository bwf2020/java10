package day11;

public class Test9 {

	public static void main(String[] args) {


		
		try {
			
			
			throw new MyException("�Զ����쳣");
			
			
		}catch (Exception e) {

			e.printStackTrace();

		}
		
		
		try {
			
			System.out.println("���������ϵ����ݿ�");
	
			if(false) {
				throw new MyException2();
			}else {
				
				System.out.println("���ݿ����ӳɹ�");
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("����");
		

	}

}
