package demo.java.lang;

import java.util.Date;




public class StringDemo {

	public static void main(String[] args) {
		String str;
		System.out.println(String.format("十进制：%d", 100));
		System.out.println(String.format("十六进制�?%x", 100));
		System.out.println(String.format("八进制：%o", 100));
		
		System.out.println(String.format("浮点数：%f", 100.5321321));
		System.out.println(String.format("浮点数：%g", 100.5321321));
		
		System.out.println(String.format("指数�?%e", 100.5321321));
		
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(String.format("日期�?%tF", date));
		System.out.println(String.format("时间�?%tT", date));
		System.out.println(String.format("�?年的第：%tj�?", date));
		
		System.out.println(String.format("1970-1-1 00:00:00 到现在所经过的秒数：%ts", date));
	}
}
