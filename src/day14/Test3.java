package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test3 {

	public static void main(String[] args) throws Exception {


		System.out.print("aaa");
		System.out.print("bbb");
		
		User u=new User();
		u.setId(1);
		u.setName("zhangsan");
		
		File file=new File("c:/file/a3.txt");
		PrintWriter pw=new PrintWriter(file);
		
		pw.println(1);
		pw.println("hello");
		pw.println(u);
		pw.print(true);
		
		pw.append("hello bwf");
		pw.write("hello 51testing");

		pw.print(97);//都会转字符串
		pw.write(97);//写值 97 转字符  a
		
		pw.write('a');
		pw.write("a");
		
		
		pw.flush();
	}

}
