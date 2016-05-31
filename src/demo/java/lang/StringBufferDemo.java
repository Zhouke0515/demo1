package demo.java.lang;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println();
		
		System.out.println(sb.append("abc"));
		System.out.println(sb.insert(1, "sc"));
		System.out.println(sb.delete(1, 3));
		System.out.println(sb.deleteCharAt(0));
		
		System.out.println(sb.reverse());
		String str="abc";  
		char[] charArr = str.toCharArray();  
		System.out.print("·´×ªºó:");  
		for(int i = charArr.length;i>0;i--){  
		    System.out.print(charArr[i-1]);  
		}  
	}

}
