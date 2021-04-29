package day20;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {


		Stream steam=Stream.of("zhangsan","lisi","wangwu","zhaoliu");
		
		
	/*	steam.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {

				
				System.out.println(t);
				
			}
			
			
		});*/
		

		//steam.forEach(str->System.out.println(str));
		
		steam.forEach(System.out::println);
		

	}

}
