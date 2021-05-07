package day23;

import java.io.IOException;
import java.util.Properties;

public class Test4 {

	public static void main(String[] args) throws Exception {


		Properties pro=new Properties();
		pro.load(Test3.class.getResourceAsStream("object.properties"));
		IUserService userService=(IUserService) Class.forName(pro.getProperty("userService")).newInstance();
		userService.doing();
					

	}

}
