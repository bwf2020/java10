package day13;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {


		System.out.println(System.getProperty("user.dir"));
		String path=System.getProperty("user.dir");
		File file=new File("C:/file","a.txt");
		//File file=new File(path,"a.txt");//当前项目根路径
		System.out.println(file);
		
		if(file.exists()) {
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		}else {
			
			System.out.println("文件或者目录不存在");
		}
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.setWritable(true);
		
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.getParent());
		
		
		//file.delete();
		
		file=new File("C:/file");
		
		System.out.println(file.isDirectory());
		
		//使用递归方式删除文件夹以及这个文件夹中的
		//file.delete();
		
		file=new File("C:/file2");
		System.out.println(file.exists());
		
		//file.mkdir();
		
		
		file=new File("C:/file2/a.txt");
		
		System.out.println(file.exists());
		
		//file.mkdir();
		
		file=new File("C:/file3/file1/file2");
		//file.mkdirs();
		
		System.out.println("==========");
		
		file=new File("C:/file");
		
		System.out.println(file.length());
		
		String[] name=file.list();
		System.out.println(Arrays.toString(name));
		System.out.println(name.length);
		
		File[] files= file.listFiles();

		for (File file2 : files) {
			if(file2.getName().endsWith(".exe"))
			System.out.println(file2.getName());
		}
		
		
		File[] files2= file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {

				if(pathname.getName().endsWith(".txt")) {
					
					return true;
				}
				return false;
			}
		});
		
		System.out.println(files2.length);
		
		
	}

}
