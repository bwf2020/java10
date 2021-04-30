package day21;

public class WareHouse {

	
	
	private int count=0;
	
	public synchronized void put() {// ������Ʒ
		
		count++;
		System.out.println("�������У�"+count);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if (count>5) {// ��Ʒ����5���ȴ�
			try {
				wait();
			} catch (Exception e) {
			} // ����ȴ���
		}
		
		notify();// ֪ͨ�����߿�������
		
		
	}
	
	
	public synchronized void get() {// ���Ѳ�Ʒ
		
		
		if (count<=1) {// �жϵ�ǰ�Ƿ��в�Ʒ��������
			try {
				wait();
			} catch (Exception e) {
			} // ����ȴ���
		}
		
		count--;
		System.out.println("���Ѻ��У�"+count);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		notify();// ֪ͨ�����߿�������
		
	}
	
	
	
	
}
