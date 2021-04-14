package day9;

public class Test4 {

	
	
	public static void show(Animal animal) {
		
		
		System.out.println(animal);
		
		
		Cat cat=(Cat) animal;
		
		System.out.println(cat.attr1);
		
		
	}
	
	
	public static void main(String[] args) {
		
		 
		Animal animal=new Animal();
		
		Dog dog=new Dog();
		
		Cat cat=new Cat();
		
		
		//animal=dog;//向上转型  安全的
		
		System.out.println(animal.name);
		
		
		//cat=(Cat) animal;//向下转型，不安全，需要强制转换
		
		
		//show(cat);
		
		//show(dog);
		
	}
}
