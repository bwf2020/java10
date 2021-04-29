package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(1);
		list.add(4);
		list.add(7);
		list.add(6);

		System.out.println(list);

		/*
		 * Collections.sort(list, new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { // TODO Auto-generated
		 * method stub return o2-o1; }
		 * 
		 * 
		 * });
		 */

		Collections.sort(list, (Integer o1, Integer o2) -> {
			return o2 - o1;
		});
		
		

		System.out.println(list);
		
		System.out.println("==============");
		
		/*
		m1(new IA() {
			
			@Override
			public void show1() {

				System.out.println("接口中的方法1");
				
			}
		});*/
		
		/*m1(()->{
			
			System.out.println("接口中的方法1 lambda");
		});*/
		
		
		m1((a)->{
			
			System.out.println("接口中的方法1 lambda"+a);
		});
		
		/*m1(()->{
			
			System.out.println("接口中的方法1 lambda");
			return 100;
		});*/
		
		//m1(()->200);
		
	
	}
	
	
	public static void m1(IA a) {
		
		a.show1(200);
		
		/*int rt=a.show1();
		
		System.out.println("返回值:"+rt);*/
	}
	
	

}
