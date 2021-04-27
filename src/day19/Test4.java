package day19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import day18.util.DBUtil;

public class Test4 {

	public static void main(String[] args) throws Exception {


		
		Connection conn=DBUtil.getConn();
		conn.setAutoCommit(false);
		
		System.out.println(conn.getTransactionIsolation());
		
		
		//conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
		conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		
		Statement cmd= conn.createStatement();
		String sql ="  select * from user ";
		
		ResultSet rs= cmd.executeQuery(sql);
		
		while(rs.next()) {
			
			System.out.println(rs.getString("name"));
			
		}
		
		
		
	}

}
