package demo.java.util;

import java.util.Calendar;

public class CalendarDemo {
	public CalendarDemo(){
		
	}
	
	/**
	 * 此方法会自动计算进位
	 * <p>增加60秒，自动换算为原日期增加1分钟</p>
	 * <p>增加100分，自动换算为原日期增加1小时40分</p>
	 * @param field
	 * @param amount
	 */
	public void add (int field, int amount){
		Calendar.getInstance().add(field, amount);
	}
	
	/**
	 * 两个日期相差小时数
	 * @param cal1
	 * @param cal2
	 * @return
	 */
	public int intervalHour(Calendar cal1, Calendar cal2) {
		long time1 = cal1.getTimeInMillis();
		long time2 = cal2.getTimeInMillis();
		return (int)(time2-time1)/(1000*60*60);
	}

	/**
	 * 两个日期相差分钟数
	 * @param cal1
	 * @param cal2
	 * @return
	 */
	public int intervalMinute(Calendar cal1, Calendar cal2) {
		long time1 = cal1.getTimeInMillis();
		long time2 = cal2.getTimeInMillis();
		return (int)(time2-time1)/(1000*60);
	}
	
	/**
	 * 两个日期相差秒数
	 * @param cal1
	 * @param cal2
	 * @return
	 */
	public int intervalSecond(Calendar cal1, Calendar cal2) {
		long time1 = cal1.getTimeInMillis();
		long time2 = cal2.getTimeInMillis();
		return (int)(time2-time1)/1000;
	}
}
