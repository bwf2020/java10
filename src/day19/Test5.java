package day19;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



import day18.util.DBUtil;

public class Test5 {

	public static void main(String[] args) throws  Exception {


		Connection conn=DBUtil.getConn();
		
		DatabaseMetaData meta=conn.getMetaData();
		
		System.out.println(meta.getDefaultTransactionIsolation());
		System.out.println(meta.getDatabaseProductName());
		System.out.println(meta.getDatabaseProductVersion());
		System.out.println(meta.getDriverName());
		System.out.println(meta.getDriverVersion());
		
		ResultSet rs= meta.getColumns(null, null, "user", null);
		
		System.out.println(rs);
		
		while(rs.next()) {
			
			
			/*System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getString(6));
			System.out.println(rs.getString(7));
			System.out.println(rs.getString(8));
			System.out.println(rs.getString(9));
			System.out.println(rs.getString(23));*/
			
		System.out.println("列名："+rs.getString("COLUMN_NAME")+" 类型："+rs.getString("TYPE_NAME"));
			
			
			
		}
		
		ResultSetMetaData rmeta= rs.getMetaData();
		
		System.out.println(rmeta.getColumnCount());
		
		
		System.out.println(rmeta.getColumnName(1));
		System.out.println(rmeta.getColumnName(2));
		System.out.println(rmeta.getColumnName(3));
		System.out.println(rmeta.getColumnName(4));
		System.out.println(rmeta.getColumnName(5));
		System.out.println(rmeta.getColumnName(6));
		

	}

}

















