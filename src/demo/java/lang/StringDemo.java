package demo.java.lang;

import java.util.Date;




public class StringDemo {

	public static void main(String[] args) {
		//String str;
		System.out.println(String.format("转换为数字：%d", 100));
		System.out.println(String.format("转换为16进制：%x", 100));
		System.out.println(String.format("%o", 100));
		
		System.out.println(String.format("%f", 100.5321321));
		System.out.println(String.format("%g", 100.5321321));
		
		System.out.println(String.format("科学计数法：%e", 100.5321321));
		
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(String.format("日期：%tF", date));
		System.out.println(String.format("时间：%tT", date));
		System.out.println(String.format("今年的第%tj天", date));
		
		System.out.println(String.format("1970-1-1 00:00:00 相差时间%ts", date));
	}
}
