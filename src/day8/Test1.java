package day8;

public class Test1 {
	
	
	
		int a;
		long b;
		boolean c;
		float d;
		
		int e=100;
		static int f=100;
	
		public  Test1() {
			
			System.out.println("�޲εĹ��캯��");
		}
		
		public Test1(int a) {
			
			System.out.println("���в����Ĺ��캯��:"+a);
		}
		
		public Test1(String a) {
			
			System.out.println("�����ַ��������Ĺ��캯��:"+a);
			
		}
		
		public Test1(int a1,long b1,boolean c1,float d1) {
			
			System.out.println("���в�����ʼ���Ĺ��캯��");
			a=a1;
			b=b1;
			c=c1;
			d=d1;
		}

		public static void main(String[] args) {
	
			
			//���ٿռ䣬���ҵ��õ���һ���޲εĹ��캯��
			Test1 t1=new Test1();
			
			System.out.println("�ڴ��ַ:"+t1);
			
			//ֱ�ӵ�����ͨ����
			//t1.Test1();
			
			t1=new Test1(100);
			System.out.println("�ڴ��ַ:"+t1);
			
			t1=new Test1("hello");
			System.out.println("�ڴ��ַ:"+t1);
			
			
			int a=100;
			
			
			System.out.println(a);
			System.out.println(t1.a);//����û�г�ʼ�����ǲ��ܱ����õģ�
			System.out.println(t1.b);
			System.out.println(t1.c);
			System.out.println(t1.d);
		
			
			t1=new Test1(100, 10L, true,10F);
			System.out.println("�ڴ��ַ:"+t1);
			
			
			System.out.println(t1.a);//ͨ�����캯����ʼ������ֵ
			System.out.println(t1.b);
			System.out.println(t1.c);
			System.out.println(t1.d);
			
			Test1 t2=new Test1();
			System.out.println(t2.e);
			System.out.println(t2.f);
			
			
			Test1 t3=new Test1();
			System.out.println(t3.e);
			System.out.println(t3.f);
	
			t2.e=200;
			System.out.println(t2.e);	
			System.out.println(t3.e);	
					
			t2.f=500;
			System.out.println(t2.f);	
			System.out.println(t3.f);
			
			System.out.println(Test1.f);
			
		}
		
		
		public void show1() {
			
			int a=100;//�ֲ������ȵ�������������ô�ͻ�����
			
		}

}


