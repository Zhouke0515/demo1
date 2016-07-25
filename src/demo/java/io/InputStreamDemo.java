package demo.java.io;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream input = new FileInputStream("D://Desktop//test.txt");
		int in = 0;
		//System.out.println(input.skip(1));
		System.out.println(input.available());
		while((in = input.read()) != -1) {
			System.out.print( (char) in);
		}
		System.out.println();
		
		
		System.out.println(input.getFD());
		System.out.println(input.getChannel());
		
		input.close();

	}

}
