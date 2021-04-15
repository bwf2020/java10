package day10;

public class Test5 {
	
	
	
	public static void m1(IAnimal animal) {
		
		//同一个类型引用，调用同一个方法，实现不同的功能，多态
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
