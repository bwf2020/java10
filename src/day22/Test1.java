package day22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class Test1 {

	public static void main(String[] args) throws  Exception {


		//代表就是本机的
		InetAddress address=InetAddress.getLocalHost();
		
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		
		System.out.println(address.isReachable(5000));
		
		
		 address=InetAddress.getByName("baidu.com");
		 
			System.out.println(address.getHostName());
			System.out.println(address.getHostAddress());
			
			System.out.println(address.isReachable(5000));
			
		System.out.println("统一资源定位");
		
		String path="http://www.boweifeng.com/zhongxinjianjie.htm";
		URL url=new URL(path);
		
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		System.out.println(url.getQuery());
		
		//通过java代码获取网络上的资源，并不是通过浏览器访问
		
		HttpURLConnection conn= (HttpURLConnection) url.openConnection();
		
		System.out.println(conn);
		
		InputStream in= conn.getInputStream();
		InputStreamReader reader=new InputStreamReader(in,"utf-8");
		BufferedReader breader=new BufferedReader(reader);
		
		String info="";
		
		File file=new File("C:\\file/a.html");
		Writer writer=new FileWriter(file);
		
		while((info=breader.readLine())!=null) {
			
			System.out.println(info);
			writer.write(info);
			
		}
		writer.flush();
		
	
		
		
	}

}
