package demo.java.puzzlers;

import java.io.File;

/**
 * 我的类是什么 II
 * @author Sven
 * @date 创建时间：2016年9月8日 下午9:48:36
 * @version 1.0
 */
public class Demo21 {

	public static void main(String[] args) {
		String className = Demo20.class.getName();

		System.out.println(className);

		// replaceALL(string,string) 第一个参数是正则表达式
		System.out.println(className.replaceAll("\\", File.separator) + ".class");
	}

}
