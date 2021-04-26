package day18.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *读取配置文件 
 * 得到数据库连接
 * 释放连接
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

			System.out.println("配置文件找不到，加载失败");
		}
		driverName=pro.getProperty("driverName");
		url=pro.getProperty("url");
		user=pro.getProperty("user");
		password=pro.getProperty("pwd");
		
		//注册驱动
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {

			System.out.println("加载驱动失败");
		}
		
		
	}
	
	private DBUtil() {
		
		
	}
	
	/**
	 * 获取数据库连接
	 * @return
	 */
	public static Connection getConn() {
		
		Connection conn=null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("数据库连接不上");
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
