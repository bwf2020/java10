package day12;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test2 {

	public static void main(String[] args) {


		System.out.println(Math.E);
		
		System.out.println(Math.PI);
		
		System.out.println(Math.abs(-10));
		
		System.out.println(Math.ceil(3.00000001));
		System.out.println(Math.floor(3.99999999));
		
		System.out.println(Math.round(3.14));
		System.out.println(Math.round(3.5));
		
		System.out.println(Math.round(-3.5));
		System.out.println(Math.round(-3.500001));


		for(int i=0;i<100;i++) {
		//System.out.println((int)(Math.random()*91+10));
			
			System.out.println(10+new Random().nextInt(91));
			
		}
		
		
		Date d1=new Date();
		
		System.out.println(d1);
		
		System.out.println(d1.getTime());
		
		System.out.println(d1.getTime()/1000/60/60/24/30/12+1970);
		
		System.out.println(System.currentTimeMillis());
		
		
		Date d2=new Date(2020-1900,1,1);
		System.out.println(d2);
		
		System.out.println(d1.after(d2));//2021在2020年后面 是true
		System.out.println(d1.before(d2));
		
		System.out.println(d1);
		System.out.println(d2);
		//比较大小
		System.out.println(d1.compareTo(d2));
		System.out.println(d2.compareTo(d1));
		
		
		
		System.out.println("===============");
		
		Calendar c=Calendar.getInstance();
		
		System.out.println(c);
		
		System.out.println(d1.getYear()+1900);
		System.out.println(d1.getMonth());
		
		System.out.println(c.get(0));
		System.out.println(c.get(1));
		System.out.println(c.get(2));
		System.out.println(c.get(3));
		System.out.println(c.get(4));
		System.out.println(c.get(5));
		
		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println(c.get(Calendar.MONTH));
		
		c.add(Calendar.MONDAY, 2);
		
		System.out.println(c.get(Calendar.MONTH)+1);
		
		c.set(Calendar.MONDAY, 2);
		System.out.println(c.get(Calendar.MONTH)+1);
		
		c.clear();
		System.out.println(c.get(Calendar.MONTH)+1);
		
		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("==============");
		
		
		Instant instant=Instant.now();
		
		System.out.println(instant);
		
		System.out.println(instant.toString());
		
		System.out.println(ZoneId.systemDefault());
		
		System.out.println("==============");
		
		LocalDate localDate=LocalDate.now();
		
		System.out.println(localDate);
		
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);
		
		
		localDateTime=localDateTime.plusDays(10);
		localDateTime=localDateTime.plusYears(1);
		
		System.out.println(localDateTime.get(ChronoField.YEAR));
		System.out.println(localDateTime.getYear());
		System.out.println(localDateTime.getDayOfMonth());
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		
		LocalDateTime local2=LocalDateTime.now();
		
		System.out.println(localDateTime.isAfter(local2));
		System.out.println(localDateTime.isBefore(local2));
		
		
		LocalDate l1=LocalDate.now();
		LocalDate l2=LocalDate.now();
		//2021-1-1
		//2021-2-3
		l2=l2.plusDays(32);
		
		Period period = Period.between(l1, l2);
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getMonths()*30+period.getDays());
		
		
		System.out.println(l1.toEpochDay());
		System.out.println(l2.toEpochDay());
		
		
		
		
	
		
		
		
		
	}

}
