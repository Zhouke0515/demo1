package demo.java.puzzlers;

import java.math.BigDecimal;

/**
 * 并不是所有的小数都可以用二进制浮点数来精确表示
 * 2个浮点数运算可能不能得到想要的结果，如2.00-1.10
 * @author Sven
 * @date 创建时间：2016年9月7日 下午8:11:39
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
