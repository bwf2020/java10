package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
	
	
	
	public static <T> String getData(T data) {
		
		return data.toString();
	}
	
	public static <T> Integer getData2(T data) {
		
		return 100;
	}
	
	public static <T> T getData3(T data) {
		
		return data;
	}
	
	public static Object getData4(Object obj) {
		
		
		return obj;
	}
	
	
	public static void getData5(List<? super WangCai> list) {
	
		System.out.println(list.size());
	}
	

	public  static void main(String[] args) {


		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(100);
		
		for (Integer s : list) {
			System.out.println(s);
		}
		
		for (int i = 0; i < list.size(); i++) {
			
			
			System.out.println(list.get(i)+1);
		}

		
		System.out.println(getData("a"));
		System.out.println(getData(100));
		System.out.println(getData(new User()));
		
		System.out.println("============");
		
		System.out.println(getData2(100));
		
		System.out.println("============");
		
		System.out.println(getData3("lisi"));
		System.out.println(getData3(new User()));
		
		System.out.println("============");
		
		
		User u= new User();
		u.name="ÕÅÈý";
		
		
		User u2=(User) getData4(u);
		System.out.println(u2.name);
		
		User u3=getData3(u);
		System.out.println(u3.name);
		
		System.out.println("=========");
		
		Animal<Dog> animal=new Animal<Dog>();
		
		Dog dog=new Dog();
		Cat cat=new Cat();
		
		animal.add(dog);
		//animal.add(cat);
		
		System.out.println("=========");
		
		
		IList<Dog> list2=new List4<Dog>();
		
		//list2.m3(new Cat());
		
		
		List<String> list3=new ArrayList<>();
		//getData5(list3);
		
		
		List<Dog> list4=new ArrayList<>();
		getData5(list4);
		
		
		List<Cat> list5=new ArrayList<>();
		//getData5(list5);
		
		List<WangCai> list6=new ArrayList<>();
		getData5(list6);
		
		
		Map<String,Dog> map=new HashMap();
		
		map.put("a", new Dog());
		map.put("b", new Dog());
		
		System.out.println(map.get("a").name);
		
		
		
	}

}
