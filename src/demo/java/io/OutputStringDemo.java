package demo.java.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStringDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D://Desktop//output.txt",true);
		
		byte[] b = {1,2,3,4,34,55,77,78,99};
		fos.write(b );
		
		fos.close();
	}

}
