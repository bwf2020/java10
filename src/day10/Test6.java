package day10;

public class Test6 {

	public static void main(String[] args) {


		System.out.println(Color.RED);
		
		
		Color c=Color.green;
		
		switch (c) {
		case RED:
			System.out.println("��ɫ");
			break;
		case green:
			System.out.println("��ɫ");
			break;
		default:
			System.out.println("��ɫ");
			break;
		}
		
		if(c==Color.green) {
			System.out.println("��ɫ");
		}
		
		
		
		
		System.out.println(Week.MON);
		
		
		Test6 t=new Test6();
		System.out.println(t);
		System.out.println(t.toString());
		
		System.out.println(Week.THU);
		System.out.println(Week.WED);
		System.out.println(Week.FRI);
		
		
		
		System.out.println("====================");

		
		Week[] weeks= Week.values();
		
		for (Week w : weeks) {
			
			System.out.println(w.name());
			System.out.println(w.ordinal());
			
			
		}
		
		Week w1= Week.valueOf("MON");
		System.out.println(w1);
		
		
		System.out.println("====================");
		
		System.out.println(Week.MON);
		
		System.out.println(Week.MON.name());
		System.out.println(Week.MON.ordinal());
		
		System.out.println(Week.MON.getDesc());
		
		
	}

}
