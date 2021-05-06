package day22;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) throws UnknownHostException, IOException {


	
		DataOutputStream clientOut=null;
		Socket socket=null;
		Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			socket=new Socket("127.0.0.1",8090);
			
			new Thread(new ClientThread(socket)).start();//�������߳�ר�Ŷ�ȡ����
			
			
		
			
			OutputStream out=socket.getOutputStream();//�ͻ��˵������
			clientOut=new DataOutputStream(out);
			String msg=null;
			System.out.println("��������Ϣ");
			do{
				msg=sc.nextLine();
				clientOut.writeUTF(msg);
			}while(!"bye".equals(msg));
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(clientOut!=null) {
					clientOut.close();
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
				}finally {
					if(sc!=null) {
						sc.close();
					}
				}
			}
		}
		
		
		
		
	
		

	}

}

 class ClientThread implements Runnable{
	private Socket socket;
	public ClientThread(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		DataInputStream clientIn=null;
		try {
			InputStream in=socket.getInputStream();//�ͻ��˵�������
			clientIn=new DataInputStream(in);
			while(!socket.isClosed()){
				String str=clientIn.readUTF();//��ȡ�������˵����
				System.out.println(str);
			}
			clientIn.close();
		} catch (IOException e) {
			System.out.println("socket�ѹر�");
		}finally {
			try {
				if(clientIn!=null) {
					clientIn.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
