package day12;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Test3 {

	public static void main(String[] args) throws UnsupportedEncodingException {


		
		User u1=new User();
		
		User u2=new User();
		
		System.out.println(u1==u2);
		
		System.out.println(u1.equals(u2));
		
		System.out.println(u1);
		System.out.println(u1.toString());
		
		
		Integer a=200;
		Integer b=200;
		
		System.out.println(a==b);
		
		System.out.println(a.intValue()==b.intValue());
		
		System.out.println(a.equals(b));
		
		
		int x=300;
		int y=300;
		
		System.out.println(x==y);
		
		Integer i=new Integer(100);
		Integer k=new Integer(100);
		
		System.out.println(i==k);
		System.out.println(i.equals(k));
		System.out.println(i);
		
		
		System.out.println("===================");

		String s1="tom";
		String s2="tom";
		
		System.out.println(s1==s2);
		System.out.println(s1);
		
		String s3=new String("tom");
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));

		String s4="t"+"om";//已经生成  s4=tom
		String s5="to"+"m";//已经生成  s5=tom
		
		System.out.println(s4==s1);//s1=tom
		
		System.out.println(s4==s3);
		
		String s6="t";
		String s7="om";
		String s8=s6+s7;//s8=tom
		
		System.out.println(s8==s1);
		System.out.println(s8);
		System.out.println(s1.equals(s8));
		
		System.out.println("===================");
		
		//GBK GB2312  UTF-8   ISO-8859-1 latin1
		System.out.println(Charset.defaultCharset());
		String str1="abc中国";
		
		char[] str2=str1.toCharArray();
		
		for (char c : str2) {
			System.out.println(c);
		}
		
		char[] str3= {'a','中',99};
		
		String str4=new String(str3);
		System.out.println(str4);
		
		System.out.println("===================");
		
		String str5="hello中国";
		byte[] str6= str5.getBytes();
		for (byte c : str6) {
			System.out.println(c);
		}
		
		String str7=new String(str6,"GBK");
		System.out.println(str7);
		
		String str="public static void main";
		
		System.out.println(str.lastIndexOf("ic"));
		System.out.println(str.lastIndexOf("ic",7));//4
		
		System.out.println(str.substring(0));
		System.out.println(str.substring(0,3));//左包右不包含
		
		System.out.println(str.substring(1,3));
		
		
		System.out.println("===================");
		
		
		System.out.println(Thread.currentThread().getName());
		
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//16  34  70 142?
		for (int j = 0; j < 10; j++) {
			sb.append("a"+j);
		}
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.insert(2, "A");
		
		System.out.println(sb.toString());
		
		sb.delete(3, 10);
		
		System.out.println(sb.toString());
		
		
		
		
		
	}

}
