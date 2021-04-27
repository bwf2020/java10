package day18.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import day18.entity.User;
import day18.util.DBUtil;
import day18.vo.UserTel;

public class UserDAO {

	
	
	public void add(User user) {
		
		
		Connection conn=DBUtil.getConn();
		
		String sql =" insert into user(id,name) values(?,?) ";
		
		PreparedStatement pcmd;
		try {
			pcmd = conn.prepareStatement(sql);
			pcmd.setInt(1, user.getId());
			pcmd.setString(2, user.getName());
			pcmd.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.closeConn(conn);
		}
		
		
		
		
	}
	
	
	public void add(User user,String tel) {
		
		
		Connection conn=DBUtil.getConn();
		
		String sql =" insert into user(name) values(?) ";
		
		PreparedStatement pcmd;
		try {
			pcmd = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			pcmd.setString(1, user.getName());
			pcmd.executeUpdate();
			ResultSet rs=pcmd.getGeneratedKeys();
			rs.next();
			int id=rs.getInt(1);
			
			System.out.println(1/0);
			
			sql=" insert into tel(uid,num) values(?,?) ";
			pcmd = conn.prepareStatement(sql);
			pcmd.setInt(1, id);
			pcmd.setString(2, tel);
			pcmd.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.closeConn(conn);
		}
		
		
		
		
	}
	
	public List<UserTel> getUserTel(int id){
		
		List<UserTel> userTelList=new ArrayList<UserTel>();
		
		Connection conn=DBUtil.getConn();
		
		StringBuffer sql =new StringBuffer();
		sql.append(" SELECT a.id,a.name,b.num AS counts  ");		
		sql.append(" FROM USER a ");
		sql.append(" LEFT JOIN tel b ");
		sql.append(" ON a.id=b.uid ");
		sql.append(" WHERE a.id=? ");
		
		PreparedStatement pcmd;
		ResultSet rs=null;
		try {
			pcmd = conn.prepareStatement(sql.toString());
			pcmd.setInt(1, id);
			rs=pcmd.executeQuery();
			while(rs.next()) {
				
				UserTel userTel=new UserTel();
				userTel.setId(rs.getInt("id"));
				userTel.setName(rs.getString("name"));
				userTel.setNum(rs.getString("counts"));//切记，用的是查询出来的列名
				
				userTelList.add(userTel);
			}
			
			return userTelList;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.closeConn(conn);
		}
		
		return null;
	}
	
	
public List<UserTel> getUserTel(){
		
		List<UserTel> userTelList=new ArrayList<UserTel>();
		
		Connection conn=DBUtil.getConn();
		
		StringBuffer sql =new StringBuffer();
		sql.append(" SELECT a.id,a.name,b.num AS counts  ");		
		sql.append(" FROM USER a ");
		sql.append(" LEFT JOIN tel b ");
		sql.append(" ON a.id=b.uid ");
		
		PreparedStatement pcmd;
		ResultSet rs=null;
		try {
			pcmd = conn.prepareStatement(sql.toString());
			rs=pcmd.executeQuery();
			while(rs.next()) {
				
				UserTel userTel=new UserTel();
				userTel.setId(rs.getInt("id"));
				userTel.setName(rs.getString("name"));
				userTel.setNum(rs.getString("counts"));//切记，用的是查询出来的列名
				
				userTelList.add(userTel);
			}
			
			return userTelList;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.closeConn(conn);
		}
		
		return null;
	}


public void del(int id) {
	
	Connection conn=DBUtil.getConn();
	
	String sql=" delete from user where id=? ";
	try {
		PreparedStatement pcmd=conn.prepareStatement(sql);
		pcmd.setInt(1, id);
		pcmd.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

/*public static void main(String[] args) {
	
	UserDAO userDAO=new UserDAO();
	userDAO.del(1);
}
	*/



/**
 * 获取所有的用户
 * @return
 */
public List<User> getAll(){
	
	
		List<User> userList=new ArrayList<>();
	
		Connection conn=DBUtil.getConn();
		String sql=" select * from user  ";
		try {
			PreparedStatement pcmd=conn.prepareStatement(sql);
			ResultSet rs=pcmd.executeQuery();
			while(rs.next()) {
				
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				
				userList.add(user);
				
				
			}
			
			return userList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	
}
	
}
