package day13;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) throws ParseException {


		Date date=new Date();
		
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E a");
		
		String str=sdf.format(date);
		
		System.out.println(str);
		
		String str2="2021/01/01 18:20:30";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date2=sdf2.parse(str2);
		
		System.out.println(date2);
		
		System.out.println("=================");
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		long times=ldt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
		System.out.println(times);
		
		String str3=sdf3.format(new Date(times));
		System.out.println(str3);
		
		
		System.out.println("=================");
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		String str4=dtf.format(ldt);
		System.out.println(str4);
		
		String str5=ldt.format(dtf);
		System.out.println(str5);
		
		System.out.println("=================");
		LocalDate ld= LocalDate.parse("2021年06月03日", dtf);
		System.out.println(ld);
		
		TemporalAccessor ta=dtf.parse("2021年06月03日");
		
		LocalDate ld2=LocalDate.from(ta);
		System.out.println(ld2);
		
		System.out.println("=================");
		
		double num=13.1455926;
		
		DecimalFormat df=new DecimalFormat(".00");
		System.out.println(df.format(num));
		
		df.applyPattern("####.##########");
		System.out.println(df.format(num));
		
		num=0.268;
		df.applyPattern(".##%");
		System.out.println(df.format(num));
		
		
		num=900000;
		df.applyPattern("000,000.00");
		System.out.println(df.format(num));
		df.applyPattern("¤000,000.00");
		System.out.println(df.format(num));
		
		System.out.println("==============");
		
		Integer[] array= {5,2,6,1,9,8,7};
		
		for (int i : array) {
			System.out.print(i);
			
		}
		System.out.println("");
		
		Arrays.sort(array);
		
		/*Arrays.sort(array, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
		});*/
		
	
		
		for (int i : array) {
			
			System.out.print(i);
			
		}
		System.out.println("");
		
		
		Integer[] newArray=Arrays.copyOf(array, 10);
		
		System.out.println(newArray);
		
		Arrays.fill(newArray, 7,10,100);
		
	
		System.out.println(newArray.toString());
		
		System.out.println(Arrays.toString(newArray));
		
		
		int[] array2= {3,7,5,9,1,2,8};
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.binarySearch(array2, 7));
		
		
		
		
		
		

	}

}
