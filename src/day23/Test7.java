package day23;

import java.lang.reflect.Field;

public class Test7 {
	
	
	@MyAnno(name="51testing",tels={"138","139"},age=22)
	public User2 user2;
	
	@MyAnno(name="bwf",tels={"138"},age=55)
	public User2 user3;
	

	public static void main(String[] args) throws  Exception {

		
		Test7 t=new Test7();
		
		System.out.println(t.user2);
		
		//读取注解
		
		Class c=Test7.class;
		Field user2Field= c.getDeclaredField("user2");
		MyAnno myAnno= user2Field.getDeclaredAnnotation(MyAnno.class);
		
		System.out.println(myAnno);
		
		System.out.println(myAnno.name());
		System.out.println(myAnno.age());
		System.out.println(myAnno.tels());
		
		System.out.println(user2Field.getType().getTypeName());
		
		t.user2=(User2) Class.forName(user2Field.getType().getTypeName()).newInstance();
		
		System.out.println(t.user2);
		
		t.user2.name=myAnno.name();
		
		t.user2.age=myAnno.age();
		
		t.user2.tels=myAnno.tels();
		
		System.out.println(t.user2.name);
		System.out.println(t.user2.age);
		System.out.println(t.user2.tels);
		


	}
	
	
	public void show1() {
		
		System.out.println("方法1");
		
	}

}
