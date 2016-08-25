package demo.java.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		Date date = new Date();

		int random = (int) (Math.random()*1000);
		System.out.println(random);
		Date newDate = new Date(date.getTime() + random*50*100*20*3);
		
		System.out.println("之前：" + date.before(newDate));
		System.out.println("之后：" + date.after(newDate));
		
		System.out.println("相差小时数：" + intervalHour(date , newDate));
		System.out.println("相差分钟数：" + intervalMinute(date , newDate));
		System.out.println("相差秒数：" + intervalSecond(date , newDate));
		
		CalendarDemo calDemo = new CalendarDemo();
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(newDate);
		System.out.println("相差小时数：" + calDemo.intervalHour(cal1, cal2));

	}
	
	public static int intervalHour(Date date1, Date date2) {
		long min1 = date1.getTime();
		long min2 = date2.getTime();
		return (int)(min2-min1)/(1000*60*60);
	}

	public static int intervalMinute(Date date1, Date date2) {
		long min1 = date1.getTime();
		long min2 = date2.getTime();
		return (int)(min2-min1)/(1000*60);
	}
	
	
	public static int intervalSecond(Date date1, Date date2) {
		long min1 = date1.getTime();
		long min2 = date2.getTime();
		return (int)(min2-min1)/1000;
	}
	
	public String formatDate(String format, Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(format); //"YYYYMMSS"
		return sdf.format(date);
	}
}
