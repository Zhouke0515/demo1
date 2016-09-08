package demo.java.puzzlers;

/**
 *  验证一个数是否是奇数
 * @author Sven
 * @date 创建时间：2016年9月7日 下午7:52:22
 * @version 1.0
 */
public class Demo1 {

	public static void main(String[] args) {
		int number;
		
		number = 1;
		boolean isOdd = isOdd(number);		
		System.out.println(number + "是否是奇数：" + isOdd);
		
		number = -1;
		isOdd = isOdd(number);		
		System.out.println(number + "是否是奇数：" + isOdd);
		
		number = 1;
		isOdd = isOdd2(number);		
		System.out.println(number + "是否是奇数：" + isOdd);
		
		number = -1;
		isOdd = isOdd2(number);		
		System.out.println(number + "是否是奇数：" + isOdd);
		
		number = 1;
		isOdd = isOdd3(number);		
		System.out.println(number + "是否是奇数：" + isOdd);
		
		number = -1;
		isOdd = isOdd3(number);		
		System.out.println(number + "是否是奇数：" + isOdd);
	}

	/**
	 * 第一种方法：余数为1
	 * <p>如果是负数，都会返回false</p>
	 * @param number
	 * @return
	 */
	public static boolean isOdd(int number) {
		return number%2 == 1;
	} 
	/**
	 * 第二种方法：余数不为0
	 * @param number
	 * @return
	 */
	public static boolean isOdd2(int number) {
		return number%2 != 0;
	} 
	
	/**
	 * 第三种方法：位操作符& 
	 * <p>最好的方法</p>
	 * @param number
	 * @return
	 */
	public static boolean isOdd3(int number) {
		//return (number | 0) != 0;
		return (number & 1) != 0;
	} 
	
	
}
