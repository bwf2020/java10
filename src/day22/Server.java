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


		System.out.println("启动服务器端");
		
		ServerSocket ss=new ServerSocket(8090);
		
		
		System.out.println("正在等待一个客户端的请求");
		Socket s= ss.accept();
		
		System.out.println("有一个客户端请求了");
		
		System.out.println("客户端的地址："+s.getRemoteSocketAddress());
		
		//接受客户端的消息  叫输入流
		InputStream in=s.getInputStream();
		InputStreamReader reader=new InputStreamReader(in);
		BufferedReader breader=new BufferedReader(reader);
		
		
	    String info="";

	    while(true) {
	    info=breader.readLine();
		System.out.println("来自客户端的消息："+info);
	
		
		//把消息返回给客户端 输出流
		OutputStream out=s.getOutputStream();
		OutputStreamWriter writer=new OutputStreamWriter(out);
		PrintWriter print=new PrintWriter(writer);
		print.println("消息已经接受到了，欢迎下次再来");
		print.flush();
		
	    }

	
	
		
	}

}
