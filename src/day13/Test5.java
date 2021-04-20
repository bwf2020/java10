package day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Test5 {

	public static void main(String[] args) throws  Exception {


		File f1=new File("c:/file/a.txt");
		Reader reader=new FileReader(f1);
		
		char[] cbuf=new char[2];
		int num=0;
		while((num=reader.read(cbuf))!=-1) {
			
			System.out.print(new String(cbuf,0,num));
			
		}
		
		
		f1=new File("c:/file/a2.txt");
		Writer writer=new FileWriter(f1);
		writer.write("ÄúºÃ£¬\r\n²©Îª·å");
		writer.flush();
		writer.close();
		
		System.out.println("");
		
	}

}
