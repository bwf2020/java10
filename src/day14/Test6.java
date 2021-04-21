package day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {


		List list=new ArrayList();

		list.add("a");
		list.add("b");
		list.add(0,"c");
		
		System.out.println(list);
		
		
		LinkedList list2=new LinkedList();
		
		list2.add("a");
		list2.add("b");
		list2.addFirst("c");
		
		System.out.println(list2);
		
		

	}

}
