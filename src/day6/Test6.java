package day6;

public class Test6 {

	
	
	
	public static void m1(int i) {
		
		System.out.println("�������ֵ:"+i);
		
		i++;
		
		System.out.println("�޸ĺ��ֵ:"+i);
		
	}
	
	
	public static void m2(int[] i) {
		
		System.out.println("�������ֵ:"+i[0]);
		
		i[0]++;
		
		System.out.println("�޸ĺ��ֵ:"+i[0]);
		
	}
	
	
	public static void main(String[] args) {


		
		
		int a=100;
		int[] b= {100};
		
		System.out.println("ԭʼ��ֵ��"+a);//100
		m1(a);
		System.out.println("��֮���ֵ��"+a);//101?
		
		
		System.out.println("ԭʼ��ֵ��"+b[0]);//100
		m2(b);
		System.out.println("��֮���ֵ��"+b[0]);//101?

	}

}
