package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.RandomAccessFile;

public class Test4 {

	public static void main(String[] args) throws  Exception {


		File file=new File("c:/file/a4.txt");
		
		/*RandomAccessFile raf=new RandomAccessFile(file, "rw");
		raf.writeUTF("中国");*/
		
		
		//RandomAccessFile raf=new RandomAccessFile(file, "r");
		/*String str=raf.readLine();
		
		System.out.println(str);*/
		
	/*	char c=raf.readChar();
		System.out.println(c);
		c=raf.readChar();
		System.out.println(c);
		c=raf.readChar();
		System.out.println(c);
		c=raf.readChar();
		System.out.println(c);*/
		
/*		String str=raf.readUTF();
		System.out.println(str);*/
		
		
		
		RandomAccessFile ras1=new RandomAccessFile(file,"rw");
	/*	ras1.writeInt(20);//写入4个字节
		ras1.writeUTF("中国");//写入8个字节，前2个字节是长度，后面6个字节是数据
		ras1.writeChars("中国");//写入2个字符，4个字节
		ras1.writeFloat(3.2F);//写入4个字节
*/		
		
		/*ras1.skipBytes(4);//跳过前4个字节
		System.out.println(ras1.readUTF());//中国
		System.out.println(ras1.readChar());//读1个字符：中
		System.out.println(ras1.readChar());//读1个字符：国
		System.out.println(ras1.readFloat());//3.2
		ras1.seek(12);//回到起始位置
		System.out.println(ras1.readChar());//20
*/
		
		
		//ras1.writeUTF("hellobwf");
		
		ras1.seek(0);
		System.out.println(ras1.readUTF());
		
		ras1.seek(0);
		System.out.println(ras1.readUTF());
		
		
		
	}
	
	
	

}
