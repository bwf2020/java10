package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws Exception {

		
		// ������DriverManager����ע����һ������
		Class.forName("com.mysql.jdbc.Driver");

		// ���Դ�DriverManager��ȡ���ݿ���ز���
		// ���ݿ������
		String url = "jdbc:mysql://localhost:3306/java10";
		String user = "root";
		String password = "123456";

		Connection conn = DriverManager.getConnection(url, user, password);

		System.out.println(conn);

		// ����sql�������ִ��
		Statement cmd = conn.createStatement();

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("����������"); String name=sc.nextLine();
		 * 
		 * System.out.println("�������Ա�"); String sex=sc.nextLine();
		 * 
		 * 
		 * 
		 * String sql=" insert into user(name,sex) values('"+name+"','"+sex+"') ";
		 */
		// ����ִ��
		/*
		 * boolean flag= cmd.execute(sql);//���±���
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

		// ͨ��Ԥ����
		/*String sql = " insert into user(name,sex) values(?,?) ";
		PreparedStatement pcmd = conn.prepareStatement(sql);// Ԥ����

		while (true) {

			System.out.println("����������");
			String name = sc.nextLine();

			System.out.println("�������Ա�");
			String sex = sc.nextLine();

			pcmd.setString(1, name);
			pcmd.setString(2, sex);

			pcmd.executeUpdate();

		}*/

		
		/*System.out.println("��������");
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
		
		System.out.println("û��������");
		
		
	}

}
