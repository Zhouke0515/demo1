package demo.java.lang;

import java.util.Date;




public class StringDemo {

	public static void main(String[] args) {
		//String str;
		System.out.println(String.format("ת��Ϊ���֣�%d", 100));
		System.out.println(String.format("ת��Ϊ16���ƣ�%x", 100));
		System.out.println(String.format("%o", 100));
		
		System.out.println(String.format("%f", 100.5321321));
		System.out.println(String.format("%g", 100.5321321));
		
		System.out.println(String.format("��ѧ��������%e", 100.5321321));
		
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(String.format("���ڣ�%tF", date));
		System.out.println(String.format("ʱ�䣺%tT", date));
		System.out.println(String.format("����ĵ�%tj��", date));
		
		System.out.println(String.format("1970-1-1 00:00:00 ���ʱ��%ts", date));
	}
}
