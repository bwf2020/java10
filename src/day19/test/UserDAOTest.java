package day19.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import day18.dao.UserDAO;
import day18.entity.User;

public class UserDAOTest {

	
	
	UserDAO userDAO=new UserDAO();
	
	
	public void testAdd() {
		
		
		User user=new User();
		user.setId(8);
		user.setName("bwf1");
		
		System.out.println("调用测试方法了");
		
		userDAO.add(user);
		
		
		
	}
	
	
	public void testTel() {
		
		
		userDAO.del(8);
		
	}
	
	
	@Test
	public void testGetAll() {
		
		
		List list= userDAO.getAll();
		
		assertEquals(list.size(), 6);
		
		
	}
	

	
}
