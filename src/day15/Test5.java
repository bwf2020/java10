package day15;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

public class Test5 {

	
	public static void main(String[] args) throws  Exception {
		
		
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(5);
		list.add(6);
		list.add(1);
		list.add(7);
		list.add(3);
		list.add(2);
		list.add(4);
		
		System.out.println(list);
		
		//Collections.sort(list);
		
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		
		System.out.println(list);
		
		//Collections.reverse(list);
		
		System.out.println(list);
		
		System.out.println("==============");
		
		
	
		Properties pro=new Properties();
		
	/*	pro.setProperty("a", "A");
		pro.setProperty("b", "B");
		
		System.out.println(pro.getProperty("a"));*/
		
		//路径，是在当前类所在的目录下面
		pro.load(Test5.class.getResourceAsStream("data.properties"));
		
		System.out.println(pro.getProperty("a"));
		System.out.println(pro.getProperty("b"));
		
		
		Integer[] num= {1,2,3};
		List list2=Arrays.asList(num);
		System.out.println(list2.size());
		
	}
}
