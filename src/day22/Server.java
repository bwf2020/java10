package day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Server {

	public static void main(String[] args) throws  Exception {


		System.out.println("������������");
		
		ServerSocket ss=new ServerSocket(8090);
		
		
		System.out.println("���ڵȴ�һ���ͻ��˵�����");
		Socket s= ss.accept();
		
		System.out.println("��һ���ͻ���������");
		
		System.out.println("�ͻ��˵ĵ�ַ��"+s.getRemoteSocketAddress());
		
		//���ܿͻ��˵���Ϣ  ��������
		InputStream in=s.getInputStream();
		InputStreamReader reader=new InputStreamReader(in);
		BufferedReader breader=new BufferedReader(reader);
		
		
	    String info="";

	    while(true) {
	    info=breader.readLine();
		System.out.println("���Կͻ��˵���Ϣ��"+info);
	
		
		//����Ϣ���ظ��ͻ��� �����
		OutputStream out=s.getOutputStream();
		OutputStreamWriter writer=new OutputStreamWriter(out);
		PrintWriter print=new PrintWriter(writer);
		print.println("��Ϣ�Ѿ����ܵ��ˣ���ӭ�´�����");
		print.flush();
		
	    }

	
	
		
	}

}
