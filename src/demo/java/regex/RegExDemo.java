package demo.java.regex;

import java.util.TreeMap;
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

//		// ��ָ��ģʽ���ַ�������
//		String line = "This order was placed for QT3000! OK?";
//		String pattern = "(.*)(\\d+)(.*)";
//		// ���� Pattern ����
//		Pattern r = Pattern.compile(pattern);
//		// ���ڴ���matcher ����
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
	 * ƥ������
	 * ��1����������ĸ���� . _��ͷ
	 * ��@
	 * ��1����������ĸ���� _
	 * ����.com��β
	 * @param input
	 * @return
	 */
	public boolean isEmail(String input) {
		String regex = "^[\\w.]{1,}@[a-zA-Z0-9_]{1,}.com$"; //  \\w �� [a-zA-Z0-9_]��Ч
		boolean isEmail = isMatch(input, regex);
		return isEmail;
	}
	
	/**
	 * ƥ��������
	 * ��11λ����
	 * �ڵ�һλ����Ϊ1
	 * �۵ڶ�λ����Ϊ3/5/7/8
	 * @param input ��֤���ַ���
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
