package day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test2 {

	public static void main(String[] args) throws  Exception {


		/*User user=new User();
		user.setId(1);
		user.setName("张三");
		user.setSex('男');*/
		
		//把用户存到文件中
		File file=new File("c:/file/user.txt");
	/*	
		OutputStream out=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(out);
		oos.writeObject(user);
		oos.flush();*/
		
		InputStream in=new FileInputStream(file);
		ObjectInputStream oin=new ObjectInputStream(in);
		
		User user2=(User) oin.readObject();
		System.out.println(user2);
		System.out.println(user2.getId());
		System.out.println(user2.getName());
		
		
		User user3=new User();
		
		User user4=(User) user3.clone();
		
		User user5=user3;
		
		
		System.out.println(user3);
		System.out.println(user4);
		System.out.println(user5);
		
		user3.setName("张三");
		user4.setName("李四");
		
		System.out.println(user3.getName());
		
		user5.setName("王五");
		System.out.println(user3.getName());
		
		
		User user6=(User) user2.clone();
		System.out.println(user6.getName());
		
		
	}

}
