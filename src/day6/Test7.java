package day6;

public  class Test7 {

	public static void main(String[] args) {


		int a=100;
		
		int[] array=new int[5];
		
		Person p=new Person();
		
		
		p.personAbcKName="博为峰";
		
		System.out.println(p.personAbcKName);
		
		p.study();
		
		
		Dog wangcai=new Dog();
		wangcai.name="旺财";
		
		Dog dahuang=new Dog();
		dahuang.name="大黄";
		
		System.out.println(wangcai);
		System.out.println(dahuang);
		
		
		dahuang.name="大黄黃";
		
		System.out.println(wangcai.name);
		
		
		System.out.println(Person.count);
		
		Person.count=1;
		
		System.out.println(Person.count);
		
		System.out.println(p.count);
		p.count=2;
		
		System.out.println(Person.count);
		
		Person p2=new Person();
		
		System.out.println(p2.count);
		
		
		System.out.println(p.count2);
		System.out.println(p2.count2);
		
		
		p.count2=1;
		
		System.out.println(p.count2);
		System.out.println(p2.count2);
		
		
	}

}
