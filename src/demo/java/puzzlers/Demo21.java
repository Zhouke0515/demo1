package demo.java.puzzlers;

import java.io.File;

/**
 * �ҵ�����ʲô II
 * @author Sven
 * @date ����ʱ�䣺2016��9��8�� ����9:48:36
 * @version 1.0
 */
public class Demo21 {

	public static void main(String[] args) {
		String className = Demo20.class.getName();

		System.out.println(className);

		// replaceALL(string,string) ��һ��������������ʽ
		System.out.println(className.replaceAll("\\", File.separator) + ".class");
	}

}
