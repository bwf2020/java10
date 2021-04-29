package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {


		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(7);
		list.add(3);
		
		/*Collections.sort(list,Test4::cmp);
		Collections.sort(list,(a,b)->{
			
			return b-a;
			
		});*/
		
		
		//Collections.sort(list, Integer::compare);
		
		Collections.sort(list, Integer::compareTo);
		
		System.out.println(list);

	}
	
	/*public static int cmp(Integer a,Integer b) {
		
		
		return b-a;
	}*/

}
