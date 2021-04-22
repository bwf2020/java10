package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {

	public static void main(String[] args) {


		Map map=new HashMap();
		
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		map.put("d", "D");
		
		
		System.out.println(map.get("a"));
		System.out.println(map.get("b"));
		
		System.out.println("===========");
		
		Set  set= map.entrySet();
		
		for (Object obj : set) {
			
			
			System.out.println("名字:"+((Entry)obj).getKey()+"值:"+((Entry)obj).getValue());
		
		}
		
		System.out.println("===========");
		
		
		Set set2=map.keySet();
		
		System.out.println(set2);
		
		for (Object key : set2) {
			
			
			System.out.println("名字："+key+"值:"+map.get(key));
			
		}
		
		System.out.println("===========");
		
		Collection collection= map.values();
		
		for (Object value : collection) {
			System.out.println(value);
		}
		
		
		System.out.println("===========");
		
		System.out.println(map);
		
		
		Map map2=new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				return (int)o1-(int)o2;
			}
			
			
		});
		

		map2.put(3, "C");
		map2.put(2, "B");
		map2.put(1, "A");
		map2.put(4, "D");
		
		System.out.println(map2);
		
		System.out.println(map2.get(2));
		

		Map map3=new HashMap();
		
		map3.put(1, "A");
		
		
		map3.put(4, "D");
		
		map3.put(3, "C");
		
		map3.put(2, "B");
		
		System.out.println(map3);
		
		
		
		System.out.println("===========");
		
		List<String> list=new ArrayList<String>();
		
		list.add("zhangsan");
		list.add("bwf");
		list.add("lisi");
		
		for (Object obj : list) {
			
			System.out.println(((String)obj).toUpperCase());
			
		}

		
		Map map4=new Hashtable();
		
		map4.put("a", "A");
		map4.put("b", "B");
		map4.put("c", "C");
		
		System.out.println(map4.get("b"));
		
		Set<Entry<String,String>> set4=map4.entrySet();
		
		for (Entry<String,String> enty : set4) {
			
			System.out.println(enty.getKey()+enty.getValue());
			
			
		}
		
		
	}

}
