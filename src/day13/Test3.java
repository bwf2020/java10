package day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Test3 {

	public static void main(String[] args) throws Exception {


		//���ļ��а����ݶ��������С����������������ֽڲ���  �ֽ�������
		InputStream in=null;
		
		//�ļ�������
		
		in=new FileInputStream("c:/file/a.txt");
		
		/*int data=in.read();
		
		while(data!=-1) {
			
			System.out.print((char)data);
			data=in.read();
		}*/
			
		
	/*	byte[] b=new byte[2];
		int num=in.read(b);
		while(num!=-1) {
			
			System.out.print(new String(b,0,num));
			num=in.read(b);
		}
		*/
		
		byte[] b=new byte[10];
		
		int num=in.read(b, 0, 2);
		System.out.println(num);
		
		System.out.println(new String(b));
		
		num=in.read(b, 0, 2);
		System.out.println(num);
		
		System.out.println(new String(b));
		
		
		File f=new File("c:/file/a2.txt");
		
		FileOutputStream out=new FileOutputStream(f);
		
		//out.write(97);
		
		String str="hello bwf";
		//out.write(str.getBytes());
		
		out.write(str.getBytes(), 0, 2);
		out.write(str.getBytes(), 2, 2);
		
		
		System.out.println("");
		System.out.println("����");
		
		

	}

}
