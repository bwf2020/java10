package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day18.entity.User;

public class Test2 {

	public static void main(String[] args) throws Exception {

		
		// 就是在DriverManager类中注册了一个驱动
		Class.forName("com.mysql.jdbc.Driver");

		// 可以从DriverManager获取数据库相关操作
		// 数据库的连接
		String url = "jdbc:mysql://localhost:3306/java10";
		String user = "root";
		String password = "123456";

		Connection conn = (Connection) DriverManager.getConnection(url, user, password);

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
		
		
		List<Map> list=new ArrayList<Map>();
		
		List<User> list2=new ArrayList<User>();
		
		while(rs.next()) {
			
			Map map=new HashMap();
			
			User u=new User();
			
			int id= rs.getInt("id");
			System.out.println(id);
			map.put("id", id);
			u.setId(id);
			
			String name=rs.getString("name");
			System.out.println(name);
			map.put("name", name);
			u.setName(name);
			
			Date date= rs.getDate("birthday");
			System.out.println(date);
			map.put("date", date);
			u.setBirthday(date);
			
			Date date2= rs.getTimestamp("mydatetime");
			System.out.println(date2);
			map.put("date2", date2);
			
			float money=rs.getFloat("money");
			System.out.println(money);
			map.put("money", money);
			
			list.add(map);
			list2.add(u);
			
			
		}
		
		
		//conn.close();
		
		if(conn!=null) {
			
			if(!conn.isClosed()) {
				
				conn.close();
				conn=null;
				
			}
			
		}
		
		
		
		System.out.println(list);
		
		for (Map map : list) {
			
			
			System.out.println("编号:"+map.get("id")+"姓名："+map.get("name"));
			
		}
		
		System.out.println("====================");
		
		for (User u : list2) {
			System.out.println("编号:"+u.getId()+"姓名："+u.getName());
		}
		
		System.out.println("没有数据了");
		
		
	}

}
