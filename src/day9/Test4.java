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
		
		
		//animal=dog;//����ת��  ��ȫ��
		
		System.out.println(animal.name);
		
		
		//cat=(Cat) animal;//����ת�ͣ�����ȫ����Ҫǿ��ת��
		
		
		//show(cat);
		
		//show(dog);
		
	}
}
