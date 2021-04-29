package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {

	static int a = 1;
	
	static String  str2="";

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");

		Stream stream = list.stream();

		System.out.println(stream);

		stream.forEach(System.out::println);

		Stream stream2 = Stream.generate(() -> {

			return a++;

		});

		stream2.limit(100).forEach(System.out::println);

		System.out.println("===============");

		Integer[] array = { 10, 2, 13, 4, 56, 6, 79 };
		Stream<Integer> streams = Arrays.stream(array);

		// streams.map((a)->(int)a*2).forEach(System.out::println);

		// streams.filter((a)->(int)a>3).forEach(System.out::println);

		// streams.sorted().forEach(System.out::println);;

		/*
		 * streams.sorted((a, b) -> { return (int) b - (int) a;
		 * }).forEach(System.out::println);
		 */

		// streams.parallel().forEach(System.out::println);

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		/*List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
		System.out.println(filtered);*/
		
		
		
		/* String str= strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining("-"));
		System.out.println(str);*/
		
		
		
		
		 strings.stream().filter(string -> !string.isEmpty()).forEach((str)->{
			 
			 
			 str2+=str+"-";
			 
		 });
		 
		 System.out.println(str2.substring(0,str2.length()-1));
		
		 List<String> names=new ArrayList<>();
		 
		 names.add("zhangsan");
		 names.add("lisi");
		 names.add("wangwu");
		 names.add("zhaoliu");
		 
		 
		 
		 List<User> users=names.stream().map(User::new).collect(Collectors.toList());
		 
		for (User user : users) {
			System.out.println(user.name);
		}
		
	}

}
