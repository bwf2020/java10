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


		System.out.println("������������");
		
		ServerSocket ss=new ServerSocket(8090);
		
		List<Socket> list=new ArrayList<>();
		
		while(true){
			Socket socket=ss.accept();//��8888�˿ڼ���,�ȴ�����
			list.add(socket);
			//�����µ��̸߳�����˿ͻ��Ľ���
			Thread t=new Thread(new ServerThread(socket,list));
			t.start();
		}
		
		

	}

}

class ServerThread implements Runnable{
	private Socket socket;//��ǰ�ͻ�
	private List<Socket> list;//��ǰ���пͻ�
	public ServerThread(Socket socket, List<Socket> list) {
		this.socket = socket;
		this.list = list;
	}
	@Override
	public void run() {
		DataInputStream serverIn=null;//��������������
		DataOutputStream serverOut=null;//�������������
		try {
			InputStream in=socket.getInputStream();
			OutputStream out=socket.getOutputStream();
			serverIn=new DataInputStream(in);
			serverOut=new DataOutputStream(out);
			serverOut.writeUTF("��ӭ:"+socket.getRemoteSocketAddress());//��ʾ��ӭ��Ϣ
			String msg=null;
			do{	
				if(!socket.isClosed())
					msg=serverIn.readUTF();//��ȡ��ǰ�ͻ��ķ���
				System.out.println(socket.getRemoteSocketAddress()+"˵:"+msg);
				for(int i=0;i<list.size();i++){//����ǰ�ͻ��ķ��Է��͸�������
					Socket s=list.get(i);
					OutputStream o=s.getOutputStream();//�������˵������
					DataOutputStream so=new DataOutputStream(o);
					if(!socket.isClosed())
						so.writeUTF(socket.getRemoteSocketAddress()+":"+msg);
				}
			}while(!"bye".equals(msg));
		} catch (IOException e) {
			System.out.println("socket�ѹر�");
		}finally{//�ͷ���Դ
			list.remove(socket);//�Ƴ���ǰ�û�
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
