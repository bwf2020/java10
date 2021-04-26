package day18;

import java.util.List;

import day18.dao.UserDAO;
import day18.entity.User;
import day18.vo.UserTel;

public class Test4 {

	public static void main(String[] args) {


		UserDAO userDAO=new UserDAO();
		User user=new User();
		//user.setId(1);
		user.setName("张三4");
		//userDAO.add(user);
		userDAO.add(user,"1328955758");
		
		
		List<UserTel> userTelList=userDAO.getUserTel(1);
		for (UserTel userTel : userTelList) {
			System.out.println("用户名:"+userTel.getName()+" 电话号码："+userTel.getNum());
		}
		
		System.out.println("================");
		
		userTelList=userDAO.getUserTel();
		for (UserTel userTel : userTelList) {
			System.out.println("用户名:"+userTel.getName()+" 电话号码："+userTel.getNum());
		}

	}

}
