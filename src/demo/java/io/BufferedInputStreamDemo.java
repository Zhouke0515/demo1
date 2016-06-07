package demo.java.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("d://Desktop//test.txt");
		BufferedInputStream input = new BufferedInputStream(in);

		

		//input.reset();
		int result = 0;
		while ((result = input.read()) != -1) {			
			input.mark(49);
			System.out.print(result + " ");
			//System.out.println();
			//System.out.print((char)result);
		}
		
		input.close();
	}

}
