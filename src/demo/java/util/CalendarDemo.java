package demo.java.util;

import java.util.Calendar;

public class CalendarDemo {
	public CalendarDemo(){
		
	}
	
	/**
	 * �˷������Զ������λ
	 * <p>����60�룬�Զ�����Ϊԭ��������1����</p>
	 * <p>����100�֣��Զ�����Ϊԭ��������1Сʱ40��</p>
	 * @param field
	 * @param amount
	 */
	public void add (int field, int amount){
		Calendar.getInstance().add(field, amount);
	}
	
	/**
	 * �����������Сʱ��
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
	 * ����������������
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
	 * ���������������
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
