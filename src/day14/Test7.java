package day14;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test7 {

	public static void main(String[] args) {


		
		Goods g1=new Goods();
		g1.setId(100);
		g1.setName("手机");
		
		Goods g2=new Goods();
		g2.setId(2);
		g2.setName("电脑");
		
		
		Goods g3=new Goods();
		g3.setId(50);
		g3.setName("平板");
		
		
		Set set=new HashSet();
		set.add(g1);
		set.add(g2);
		set.add(g3);
		
		for (Iterator it = set.iterator(); it.hasNext();) {
			Goods g = (Goods) it.next();
			System.out.println(g.getName());
			
		}
		
		System.out.println("=============");
		
		Set set2=new TreeSet();
		set2.add(g1);
		set2.add(g2);
		set2.add(g3);
		
		for (Iterator it = set2.iterator(); it.hasNext();) {
			Goods g = (Goods) it.next();
			System.out.println(g.getName());
			
		}
		
		
		System.out.println("=============");
		
		Set set3=new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				
				return ((Goods)o1).getId().compareTo(((Goods)o2).getId());
			}
		});
		set3.add(g1);
		set3.add(g2);
		set3.add(g3);
		
		
		
		for (Iterator it = set3.iterator(); it.hasNext();) {
			Goods g = (Goods) it.next();
			System.out.println(g.getName());
			
		}

	}

}
