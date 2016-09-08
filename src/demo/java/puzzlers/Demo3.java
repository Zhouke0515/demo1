package demo.java.puzzlers;
/** 
 * 长整除
 * @author  Sven 
 * @date 创建时间：2016年9月7日 下午10:03:56 
 * @version 1.0 
 */
public class Demo3 {

	public static void main(String[] args) {
		
//		java中的int类型存储长度为32bit,
//		所以范围是“-2^32”到“2^32-1”,
//		也就是“-2147483648”到“2147483647”

		//因为a的因子都是int类型，得到的结果也会是int类型
		long a = 24 * 60 * 60 * 1000;
		long b = 24 * 60 * 60 * 1000 * 1000;
		System.out.println(b + "/" + a + "=" + b/a);
		
		long x = 24 * 60 * 60 * 1000L;
		long y = 24 * 60 * 60 * 1000 * 1000L;
		System.out.println(y + "/" + x + "=" + y/x);

	}

}
