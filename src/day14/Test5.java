package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {


		Collection c=new ArrayList();
		User u=new User();
		u.setName("张三");
		
		System.out.println(c);
		
		c.add(100);
		c.add("bwf");
		c.add(true);
		c.add(u);
		
		System.out.println(c);
		
		System.out.println(c.contains(200));
		
		c.remove(100);
		System.out.println(c);
		
		c.add(100);
		c.add(100);
		
		System.out.println(c);
		
		
		
		Collection c2=new ArrayList();
		c2.add(100);
		c2.add("bwf");
		c.removeAll(c2);
		
		System.out.println(c);
		
		System.out.println(c.size());
		
		
	
		List list=new ArrayList();
		System.out.println(list.size());
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add(2,"d");
	
	
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		
		/*list.remove(2);
		
		System.out.println(list);*/
		
		System.out.println(list.get(3));
		
		//list.clear();
		
		System.out.println(list);
		
		
		System.out.println("================");
		Set set=new HashSet();
		set.add(100);
		set.add("bwf");
		set.add("abc");
		
		System.out.println(set.size());
		
		set.add("bwf");
		
		System.out.println(set.size());
		
		//通过迭代器
		Iterator it=set.iterator();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("============");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("============");
		
		it=list.iterator();
		

		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		System.out.println("============");
		
		for (Iterator it2 = set.iterator(); it2.hasNext();) {
			Object obj = (Object) it2.next();
			System.out.println(obj);
			
		}

	}

}
