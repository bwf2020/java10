package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.RandomAccessFile;

public class Test4 {

	public static void main(String[] args) throws  Exception {


		File file=new File("c:/file/a4.txt");
		
		/*RandomAccessFile raf=new RandomAccessFile(file, "rw");
		raf.writeUTF("�й�");*/
		
		
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
	/*	ras1.writeInt(20);//д��4���ֽ�
		ras1.writeUTF("�й�");//д��8���ֽڣ�ǰ2���ֽ��ǳ��ȣ�����6���ֽ�������
		ras1.writeChars("�й�");//д��2���ַ���4���ֽ�
		ras1.writeFloat(3.2F);//д��4���ֽ�
*/		
		
		/*ras1.skipBytes(4);//����ǰ4���ֽ�
		System.out.println(ras1.readUTF());//�й�
		System.out.println(ras1.readChar());//��1���ַ�����
		System.out.println(ras1.readChar());//��1���ַ�����
		System.out.println(ras1.readFloat());//3.2
		ras1.seek(12);//�ص���ʼλ��
		System.out.println(ras1.readChar());//20
*/
		
		
		//ras1.writeUTF("hellobwf");
		
		ras1.seek(0);
		System.out.println(ras1.readUTF());
		
		ras1.seek(0);
		System.out.println(ras1.readUTF());
		
		
		
	}
	
	
	

}
