package demo.java.puzzlers;

import java.math.BigDecimal;

/**
 * ���������е�С���������ö����Ƹ���������ȷ��ʾ
 * 2��������������ܲ��ܵõ���Ҫ�Ľ������2.00-1.10
 * @author Sven
 * @date ����ʱ�䣺2016��9��7�� ����8:11:39
 * @version 1.0
 */
public class Demo2 {

	public static void main(String[] args) {
		
		double a = 2.00D;
		double b = 1.10D;
		System.out.println(a - b);
		
		System.out.println(2.00 - 1.10);

		System.out.printf("%.2f%n", 2.00 - 1.10);

		System.out.println(200 - 110);

		System.out.println(new BigDecimal("2.00").
				subtract(new BigDecimal("1.10")));
	}

}
