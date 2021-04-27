package day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

import day18.util.DBUtil;

public class Test1 {

	public static void main(String[] args){


		Connection conn=DBUtil.getConn();
		
		try {
		
		
		conn.setAutoCommit(false);
		
		String sql=" insert into user(name,sex) values(?,?) ";
		PreparedStatement pcmd=conn.prepareStatement(sql);
		
		pcmd.setString(1, "bwf1");
		pcmd.setString(2, "m");
		
		pcmd.executeUpdate();
		Savepoint sp= conn.setSavepoint("第一次保存的");
	
		//System.out.println(1/0);
		
		pcmd.setString(1, "bwf2");
		pcmd.setString(2, "w");
		
		pcmd.executeUpdate();
		
		
		
		System.out.println("提交了");
		conn.commit();
		}catch (Exception e) {
			
			

			System.out.println("回滚");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//conn.rollback(sp);
		}
		
		
		
	}

}
