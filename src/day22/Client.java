package day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {

		System.out.println("���������");
		Socket s = new Socket("127.0.0.1", 8090);

		System.out.println("ͨ������������໥ͨѶ");

		// �ɿͻ������������������ �����
		OutputStream out = s.getOutputStream();
		OutputStreamWriter writer = new OutputStreamWriter(out);

		BufferedWriter bwriter=new BufferedWriter(writer);
		Scanner sc = new Scanner(System.in);

		String info="";

		while(!info.equals("bye")) {
		
		System.out.println("��������Ϣ");

		info=sc.nextLine();
		
		//bwriter.write(info);
		//bwriter.newLine();
		//bwriter.flush();
		PrintWriter print=new PrintWriter(writer);
		print.println(info);
		print.flush();
		
		//��ȡ�������˵���Ϣ��������
		InputStream in=s.getInputStream();
		InputStreamReader reader=new InputStreamReader(in);
		BufferedReader breader=new BufferedReader(reader);
		System.out.println("���Է���������Ϣ��"+breader.readLine());

		
		}

	

	}

}
