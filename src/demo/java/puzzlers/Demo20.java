package demo.java.puzzlers;

import java.util.regex.Pattern;

/** 
 * 我的类是什么
 * @author  Sven 
 * @date 创建时间：2016年9月8日 下午9:39:11 
 * @version 1.0 
 */
public class Demo20 {

	public static void main(String[] args) {
		String className = Demo20.class.getName();
		
		System.out.println(className);
		
		//replaceALL(string,string) 第一个参数是正则表达式
		System.out.println(className.replaceAll(".","/") + ".class");
		System.out.println(className.replaceAll(Pattern.quote("."),"/") + ".class");
		System.out.println(className.replace(".","/") + ".class");
	}

}
