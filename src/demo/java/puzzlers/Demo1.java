package demo.java.puzzlers;

/**
 *  ��֤һ�����Ƿ�������
 * @author Sven
 * @date ����ʱ�䣺2016��9��7�� ����7:52:22
 * @version 1.0
 */
public class Demo1 {

	public static void main(String[] args) {
		int number;
		
		number = 1;
		boolean isOdd = isOdd(number);		
		System.out.println(number + "�Ƿ���������" + isOdd);
		
		number = -1;
		isOdd = isOdd(number);		
		System.out.println(number + "�Ƿ���������" + isOdd);
		
		number = 1;
		isOdd = isOdd2(number);		
		System.out.println(number + "�Ƿ���������" + isOdd);
		
		number = -1;
		isOdd = isOdd2(number);		
		System.out.println(number + "�Ƿ���������" + isOdd);
		
		number = 1;
		isOdd = isOdd3(number);		
		System.out.println(number + "�Ƿ���������" + isOdd);
		
		number = -1;
		isOdd = isOdd3(number);		
		System.out.println(number + "�Ƿ���������" + isOdd);
	}

	/**
	 * ��һ�ַ���������Ϊ1
	 * <p>����Ǹ��������᷵��false</p>
	 * @param number
	 * @return
	 */
	public static boolean isOdd(int number) {
		return number%2 == 1;
	} 
	/**
	 * �ڶ��ַ�����������Ϊ0
	 * @param number
	 * @return
	 */
	public static boolean isOdd2(int number) {
		return number%2 != 0;
	} 
	
	/**
	 * �����ַ�����λ������& 
	 * <p>��õķ���</p>
	 * @param number
	 * @return
	 */
	public static boolean isOdd3(int number) {
		//return (number | 0) != 0;
		return (number & 1) != 0;
	} 
	
	
}
