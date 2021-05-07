package day23;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test1 implements Runnable {

	DatagramSocket ds = null;

	int length = 1024;

	byte[] buf = new byte[length];


	public static void main(String[] args) throws Exception {

		Test1 t = new Test1();
		t.ds = new DatagramSocket(8090);

		// 创建两个线程
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();

	}

	@Override
	public void run() {

		while (true) {

			try {

				System.out.println("正在接受客户端发送的数据");
				DatagramPacket dp = new DatagramPacket(buf, length);
				ds.receive(dp);

				// 获取数据
				String string = new String(dp.getData(), 0, dp.getLength()) + "  from  "
						+ dp.getAddress().getHostAddress() + ":" + dp.getPort();
				Thread.sleep(6000);
				System.out.println(string);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
