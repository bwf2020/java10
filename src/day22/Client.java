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

		System.out.println("请求服务器");
		Socket s = new Socket("127.0.0.1", 8090);

		System.out.println("通过输入输出流相互通讯");

		// 由客户端向服务器发送数据 输出流
		OutputStream out = s.getOutputStream();
		OutputStreamWriter writer = new OutputStreamWriter(out);

		BufferedWriter bwriter=new BufferedWriter(writer);
		Scanner sc = new Scanner(System.in);

		String info="";

		while(!info.equals("bye")) {
		
		System.out.println("请输入信息");

		info=sc.nextLine();
		
		//bwriter.write(info);
		//bwriter.newLine();
		//bwriter.flush();
		PrintWriter print=new PrintWriter(writer);
		print.println(info);
		print.flush();
		
		//获取服务器端的消息，输入流
		InputStream in=s.getInputStream();
		InputStreamReader reader=new InputStreamReader(in);
		BufferedReader breader=new BufferedReader(reader);
		System.out.println("来自服务器端消息："+breader.readLine());

		
		}

	

	}

}
