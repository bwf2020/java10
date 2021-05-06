package day22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server2 {

	public static void main(String[] args) throws IOException {


		System.out.println("启动服务器端");
		
		ServerSocket ss=new ServerSocket(8090);
		
		List<Socket> list=new ArrayList<>();
		
		while(true){
			Socket socket=ss.accept();//在8888端口监听,等待连接
			list.add(socket);
			//启动新的线程负责与此客户的交互
			Thread t=new Thread(new ServerThread(socket,list));
			t.start();
		}
		
		

	}

}

class ServerThread implements Runnable{
	private Socket socket;//当前客户
	private List<Socket> list;//当前所有客户
	public ServerThread(Socket socket, List<Socket> list) {
		this.socket = socket;
		this.list = list;
	}
	@Override
	public void run() {
		DataInputStream serverIn=null;//服务器端输入流
		DataOutputStream serverOut=null;//服务器端输出流
		try {
			InputStream in=socket.getInputStream();
			OutputStream out=socket.getOutputStream();
			serverIn=new DataInputStream(in);
			serverOut=new DataOutputStream(out);
			serverOut.writeUTF("欢迎:"+socket.getRemoteSocketAddress());//提示欢迎信息
			String msg=null;
			do{	
				if(!socket.isClosed())
					msg=serverIn.readUTF();//读取当前客户的发言
				System.out.println(socket.getRemoteSocketAddress()+"说:"+msg);
				for(int i=0;i<list.size();i++){//将当前客户的发言发送给所有人
					Socket s=list.get(i);
					OutputStream o=s.getOutputStream();//服务器端的输出流
					DataOutputStream so=new DataOutputStream(o);
					if(!socket.isClosed())
						so.writeUTF(socket.getRemoteSocketAddress()+":"+msg);
				}
			}while(!"bye".equals(msg));
		} catch (IOException e) {
			System.out.println("socket已关闭");
		}finally{//释放资源
			list.remove(socket);//移除当前用户
			try {
				if(serverIn!=null) {
					serverIn.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(serverOut!=null) {
						serverOut.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						if(socket!=null) {
							socket.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
