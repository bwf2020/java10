package day4;

public class Test8 {
	
	
	public static void main(String[] args) {
		
		
		int i=100;
		
		/*if(i++>1000&&i++>10) {
			
			System.out.println("条件1满足");
		}
		
		System.out.println("i="+i);//101
*/		
		
		/*if(i++>1000||i++>10){
			System.out.println("条件2满足");
		}
	
		System.out.println("i="+i);//102
		
		
		System.out.println(true^false);
		System.out.println(true^true);
		System.out.println(false^false);
		
		System.out.println(!false);*/
		
		
		/*if(i++>1000&i++>10) {
			
			System.out.println("条件3满足");
		}
		
		System.out.println("i="+i);//102
*/		
		
		if(i++>1000|i++>10) {
			
			System.out.println("条件4满足");
		}
		
		System.out.println("i="+i);//102
		
		short s=100;
		
		//s=(short) (s+1);
		s+=1;
		
		
		int a=5;
		
		int b=3*++a;
		System.out.println(b);
		
		float c=true?5/2f:10f;
		
		System.out.println(c);
		
		
		int a1=10;
		int b1=20;
		
		int t1=a1;
		a1=b1;
		b1=t1;
		
		System.out.println(a1);
		System.out.println(b1);

		
		a1=a1+b1;//a=30, b=20;
		b1=a1-b1;//a=30, b=10;
		a1=a1-b1;//a=20, b=10;
		
		
		System.out.println(a1);
		System.out.println(b1);

		
		a1=a1^b1;// a=10^20
		b1=a1^b1;// b=10^20^20=10
		a1=a1^b1;// a=10^20^10=20
		System.out.println("a="+a1+";b="+b1);
		
	}

}
