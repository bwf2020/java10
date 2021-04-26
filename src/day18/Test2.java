package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws Exception {

		
		// 就是在DriverManager类中注册了一个驱动
		Class.forName("com.mysql.jdbc.Driver");

		// 可以从DriverManager获取数据库相关操作
		// 数据库的连接
		String url = "jdbc:mysql://localhost:3306/java10";
		String user = "root";
		String password = "123456";

		Connection conn = DriverManager.getConnection(url, user, password);

		System.out.println(conn);

		// 创建sql命令，并且执行
		Statement cmd = conn.createStatement();

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("请输入名字"); String name=sc.nextLine();
		 * 
		 * System.out.println("请输入性别"); String sex=sc.nextLine();
		 * 
		 * 
		 * 
		 * String sql=" insert into user(name,sex) values('"+name+"','"+sex+"') ";
		 */
		// 调用执行
		/*
		 * boolean flag= cmd.execute(sql);//重新编译
		 * 
		 * System.out.println(flag);
		 */

		/*
		 * int rows=cmd.executeUpdate(sql); System.out.println(rows);
		 */

		/*
		 * String sql=" update user set sex='w' "; int rows=cmd.executeUpdate(sql);
		 * 
		 * 
		 * System.out.println(rows);
		 */

		/*
		 * String sql=" delete from  user where id=2 "; int rows=cmd.executeUpdate(sql);
		 * 
		 * 
		 * System.out.println(rows);
		 */

		// 通过预编译
		/*String sql = " insert into user(name,sex) values(?,?) ";
		PreparedStatement pcmd = conn.prepareStatement(sql);// 预编译

		while (true) {

			System.out.println("请输入名字");
			String name = sc.nextLine();

			System.out.println("请输入性别");
			String sex = sc.nextLine();

			pcmd.setString(1, name);
			pcmd.setString(2, sex);

			pcmd.executeUpdate();

		}*/

		
		/*System.out.println("请输入编号");
		String id=sc.nextLine();*/
		
		
	/*	String sql=" delete from user where id="+id;
		
		cmd=conn.createStatement();
		
		cmd.executeUpdate(sql);*/
		
		
		/*String sql = " delete from user where id=? ";
		PreparedStatement pcmd = conn.prepareStatement(sql);
		
		pcmd.setString(1, id);
		
		pcmd.executeUpdate();*/
		
		String sql=" select * from user where 1=1 ";
		PreparedStatement pcmd = conn.prepareStatement(sql);
		
		
		
		ResultSet rs= pcmd.executeQuery();
		
		/*System.out.println(rs.next());
		
		int id= rs.getInt("id");
		System.out.println(id);
		
		String name=rs.getString("name");
		System.out.println(name);
		
		System.out.println(rs.next());
		
		id= rs.getInt("id");
		System.out.println(id);
		
		name=rs.getString("name");
		System.out.println(name);
		
		
		System.out.println(rs.next());*/
	/*	id= rs.getInt("id");
		System.out.println(id);*/
		
		
		while(rs.next()) {
			
			int id= rs.getInt("id");
			System.out.println(id);
			
			String name=rs.getString("name");
			System.out.println(name);
			
		}
		
		System.out.println("没有数据了");
		
		
	}

}
