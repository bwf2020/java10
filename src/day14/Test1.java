package day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Test1 {

	public static void main(String[] args) throws Exception {


		
		File f1=new File("c:/file/a.txt");
		
		/*InputStream in=new FileInputStream(f1);
		
		//�����ַ���ȥ����
		Reader reader=new InputStreamReader(in);
		
		char[] cbuf=new char[in.available()/2];
		reader.read(cbuf);
		System.out.println(new String(cbuf));*/
		
		
		Reader reader=new FileReader(f1);
		
		BufferedReader br=new BufferedReader(reader);
		
		String str=br.readLine();
		
		while(str!=null) {
			
			System.out.println(str);
			str=br.readLine();
			
		}
		
		
		
		

		f1=new File("c:/file/a2.txt");
		
		OutputStream out=new FileOutputStream(f1);
		OutputStreamWriter outw=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(outw);

		bw.write("����51testing\r\n����java10��ѧԱ");
		bw.flush();
		
		bw.close();
		
	}

}
