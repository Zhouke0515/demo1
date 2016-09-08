package demo.java.puzzlers;

/**
 * @author Sven
 * @date 创建时间：2016年9月8日 下午9:32:01
 * @version 1.0
 */
public class Demo19 {

	public static void main(String[] args) {
		System.out.println(classify('n') + classify('+') + classify('2'));

	}

	public static String classify(char ch) {
		if ("0123456789".indexOf(ch) >= 0)
			return "NUMERAL";
		if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0)
			return "LETTER";
		
		if ("+-*/&!=".indexOf(ch) >= 0)
			return "OPERATOR";

		return "UMKOWN";
	}

}
