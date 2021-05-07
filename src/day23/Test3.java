package day23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Properties;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws  Exception {


		User u=new User();
		
		Class c1=User.class;
		Class c2=u.getClass();
		Class c3=Class.forName("day23.User");
		
		System.out.println(u);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		
		Class c4=Dog.class;
		System.out.println(c4);
		System.out.println(c3==c4);
		
		System.out.println("获取字段，属性");
		
		
		Field[] fields= c1.getFields();
		
		fields= c1.getDeclaredFields();
		
		System.out.println(fields.length);
		System.out.println("===============");
		for (Field field : fields) {
			
			System.out.println(field.getName());
			System.out.println(field.getType());
			System.out.println(Modifier.toString(field.getModifiers()));
		}
		
		System.out.println("===============");
		
		Field id=c1.getField("id");
		
		System.out.println(id);
		
		Field name=c1.getDeclaredField("name");
		name.setAccessible(true);
		name.set(u, "51testing");
		
		System.out.println(name);
		
		
		System.out.println("===============");
		
		System.out.println(u.id);
		System.out.println(u.getName());
		
		//通过反射获取值或者设置值  
		System.out.println(id.get(u));
		System.out.println(name.get(u));
		
		
		Scanner sc=new Scanner(System.in);
		
		
			
	/*	System.out.println("请输入你要获取的属性的值");
		String attr=sc.nextLine();
		
		if(attr.equals("id")) {
			System.out.println(u.id );//静态处理
		}else if(attr.equals("name")) {
			System.out.println(u.getName());
		}
		Field f=c1.getDeclaredField(attr);
		
		f.setAccessible(true);
		System.out.println(f.get(u));//动态处理
*/		
	
		
		
		System.out.println("======方法=========");
		
		Method[] methods= c1.getDeclaredMethods();
		System.out.println(methods.length);
		
		for (Method method : methods) {
			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
			System.out.println(method.getReturnType());
			Parameter[] params=method.getParameters();
			for (Parameter param : params) {
				System.out.println("参数名:"+param.getName());
			}
			
		}
		
		
		System.out.println("======方法的调用=========");
		
		u.m1();
		System.out.println(u.m2());
		System.out.println(u.m3("bwf", 1));
		
		System.out.println("======方法的调用2=========");
		
		Method m1=c1.getDeclaredMethod("m1");
		
		m1.invoke(u);
		
		Method m2=c1.getDeclaredMethod("m2");
				
		System.out.println(m2.invoke(u));
				
				
		Method m3=c1.getDeclaredMethod("m3",String.class,int.class);
				
		System.out.println(m3.invoke(u,"bwf",100));
		
		Method m4=c1.getDeclaredMethod("m4");
		m4.invoke(null);
		
		System.out.println("========构造==========");
		
		Constructor<User>  c=c1.getDeclaredConstructor();
		
		System.out.println(c);
		
		User u2= c.newInstance();
		User u3=new User();
		
		System.out.println(u2);
		System.out.println(u3);
		
		Dog dog1= (Dog) Class.forName("day23.Dog").newInstance();
		System.out.println(dog1);
		
		
		System.out.println("可以实现工厂模式");
		//通过反射机制实例化对象，加删接口，读取配置文件  组合成一个功能  
		Properties pro=new Properties();
		pro.load(Test3.class.getResourceAsStream("object.properties"));
		IUserService userService=(IUserService) Class.forName(pro.getProperty("userService")).newInstance();
		userService.doing();
					

	}

}
