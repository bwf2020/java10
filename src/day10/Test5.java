package day10;

public class Test5 {
	
	
	
	public static void m1(IAnimal animal) {
		
		//ͬһ���������ã�����ͬһ��������ʵ�ֲ�ͬ�Ĺ��ܣ���̬
		animal.jiaosheng();
		
	}
	

	public static void main(String[] args) {


		
		/*Dog dog=new Dog();
		
		dog.jiaosheng();
		
		Cat cat=new Cat();
		
		cat.jiaosheng();*/
		
		
		IAnimal dog=new Dog();
		m1(dog);
		
		IAnimal cat=new Cat();
		m1(cat);
		
		IAnimal monkey=new Monkey();
		m1(monkey);
		

	}

}
