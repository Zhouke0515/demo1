package demo.java.puzzlers;

import java.util.regex.Pattern;

/** 
 * �ҵ�����ʲô
 * @author  Sven 
 * @date ����ʱ�䣺2016��9��8�� ����9:39:11 
 * @version 1.0 
 */
public class Demo20 {

	public static void main(String[] args) {
		String className = Demo20.class.getName();
		
		System.out.println(className);
		
		//replaceALL(string,string) ��һ��������������ʽ
		System.out.println(className.replaceAll(".","/") + ".class");
		System.out.println(className.replaceAll(Pattern.quote("."),"/") + ".class");
		System.out.println(className.replace(".","/") + ".class");
	}

}
