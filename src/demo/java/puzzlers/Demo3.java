package demo.java.puzzlers;
/** 
 * ������
 * @author  Sven 
 * @date ����ʱ�䣺2016��9��7�� ����10:03:56 
 * @version 1.0 
 */
public class Demo3 {

	public static void main(String[] args) {
		
//		java�е�int���ʹ洢����Ϊ32bit,
//		���Է�Χ�ǡ�-2^32������2^32-1��,
//		Ҳ���ǡ�-2147483648������2147483647��

		//��Ϊa�����Ӷ���int���ͣ��õ��Ľ��Ҳ����int����
		long a = 24 * 60 * 60 * 1000;
		long b = 24 * 60 * 60 * 1000 * 1000;
		System.out.println(b + "/" + a + "=" + b/a);
		
		long x = 24 * 60 * 60 * 1000L;
		long y = 24 * 60 * 60 * 1000 * 1000L;
		System.out.println(y + "/" + x + "=" + y/x);

	}

}
