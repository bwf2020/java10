package day23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws Exception {

		DatagramSocket ds = new DatagramSocket();

		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		
		System.out.println("��������Ϣ");
		
		String str = sc.nextLine();

		DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length,
				InetAddress.getByName("localhost"), 8090);
		
		//�������ݰ�
		
		System.out.println("�������ݰ�");
		ds.send(dp);
		
		}
		

	}

}
