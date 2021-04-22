package day15;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {


		Map map=new HashMap();
		
		System.out.println(map);
		
		map.put("a", "A");
		map.put("a", "A2");
		
		map.put(null, "A2");
		
		map.put(null, null);
		
		map.remove("a");
		
		
		System.out.println(map);
		
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsKey(null));
		
		map.put("null", null);
		
		map.put("", "");
		
		map.put(" ", " ");
		
		map.put(1, 100);
		
		
		User u=new User();
		map.put(u, "张三");
		
		map.put(u, "张三1");
		
		User u2=new User();
		
		map.put(u2, "张三2");
		
		System.out.println(map);

	}

}
