package day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test4 {

	public static void main(String[] args) throws Exception {
		
		
		
		long start=System.currentTimeMillis();
		
		File f1=new File("D:\\YingshiDownload\\a.mp4");
		InputStream in=new FileInputStream(f1);
		
		File f2=new File("c:\\file\\a2.mp4");
		OutputStream out=new FileOutputStream(f2);
		
		System.out.println(in.available());
		byte[] b=new byte[1024*1024*8];
		while(in.read(b)!=-1) {
			
			//把b数据写入到文件中
			out.write(b);
		
		}
		
		
		long end=System.currentTimeMillis();
		
		System.out.println("总耗时："+(end-start));
		
	}

}
