package day18.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *��ȡ�����ļ� 
 * �õ����ݿ�����
 * �ͷ�����
 * @author BWF-SCH
 *
 */
public class DBUtil {

	
	private static String driverName;
	private static String url;
	private static String user;
	private static String password;
	
	
	
	static {
		
		Properties pro=new Properties();
		try {
			pro.load(DBUtil.class.getResourceAsStream("db.properties"));
		} catch (IOException e) {

			System.out.println("�����ļ��Ҳ���������ʧ��");
		}
		driverName=pro.getProperty("driverName");
		url=pro.getProperty("url");
		user=pro.getProperty("user");
		password=pro.getProperty("pwd");
		
		//ע������
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {

			System.out.println("��������ʧ��");
		}
		
		
	}
	
	private DBUtil() {
		
		
	}
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 */
	public static Connection getConn() {
		
		Connection conn=null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("���ݿ����Ӳ���");
		}
		return conn;
		
		
	}
	
	
	public static void closeConn(Connection conn) {
		
		
		if(conn!=null) {
			
			
			try {
				if(!conn.isClosed()) {
					
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
				conn=null;
			}
		}
		
	}
	
}
