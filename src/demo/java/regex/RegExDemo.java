package demo.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	private Pattern pattern;
	private Matcher matcher;
	public static void main(String[] args) {
		RegExDemo regex = new RegExDemo();
		String key = "Java";
		String input = "Java program";
		boolean result = regex.isStartWith(key , input);
		System.out.println(key + " is start with " + input +": " + result);

//		// 按指定模式在字符串查找
//		String line = "This order was placed for QT3000! OK?";
//		String pattern = "(.*)(\\d+)(.*)";
//		// 创建 Pattern 对象
//		Pattern r = Pattern.compile(pattern);
//		// 现在创建matcher 对象
//		Matcher m = r.matcher(line);
//		if (m.find()) {
//			System.out.println("Found value: " + m.group(0));
//			System.out.println("Found value: " + m.group(1));
//			System.out.println("Found value: " + m.group(2));
//		} else {
//			System.out.println("NO MATCH");
//		}
		String number = "86-13983712941";
		boolean isPhoneNumber = regex.isMobilePhoneNumber(number);
		System.out.println(number + " is mobilephone number : " + isPhoneNumber);
		
		
		String email = "a_a.x@bb.com";
		boolean isEmail = regex.isEmail(email);
		System.out.println(email + " is email: " + isEmail);

	}

	/**
	 * @return 
	 * 
	 */
	public boolean isStartWith(String key , String input) {
		String regex = "^"+ key + ".*";
		boolean result = isMatch(input, regex);
		return result;
	}


	/**
	 * 匹配条件
	 * ①1个及以上字母数字 . _开头
	 * ②@
	 * ③1个及以上字母数字 _
	 * ④以.com结尾
	 * @param input
	 * @return
	 */
	public boolean isEmail(String input) {
		String regex = "^[\\w.]{1,}@[a-zA-Z0-9_]{1,}.com$"; //  \\w 与 [a-zA-Z0-9_]等效
		boolean isEmail = isMatch(input, regex);
		return isEmail;
	}
	
	/**
	 * 匹配条件：
	 * ①11位数字
	 * ②第一位数字为1
	 * ③第二位数字为3/5/7/8
	 * @param input 验证的字符串
	 * @return
	 */
	public boolean isMobilePhoneNumber(String input) {
		String regex = "^([\\d]{2,3}-)?[1][3|5|7|8][\\d]{9}$";
		boolean result = isMatch(input, regex);
		return result;
	}
	
	/**
	 * @param input
	 * @param regex
	 * @return
	 */
	private boolean isMatch(String input, String regex) {
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(input);	
		boolean result = matcher.matches();
		return result;
	}
	
	private boolean isUrl() {
		return false;
	}
}
