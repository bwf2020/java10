package day19;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import day18.util.DBUtil;

public class Test2 {

	public static void main(String[] args) throws Exception {


		
		Connection conn=DBUtil.getConn();
		conn.setAutoCommit(false);
		
		System.out.println(conn.getTransactionIsolation());
		
		
		conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
		
		Statement cmd= conn.createStatement();
		String sql =" insert into user(name,sex) values('bwf1','w')";
		
		cmd.executeUpdate(sql);
		
		System.out.println("我还没有提交");
		
		conn.commit();
		
		System.out.println("我已经提交");
		
		
		
	}

}
