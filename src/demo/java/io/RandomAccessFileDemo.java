package demo.java.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("d://Desktop//test.txt",
				"rw");

		//file.writeChars("write String");
		file.writeUTF("han字可以了？");

		file.seek(0);
		int result = 0;
		while ((result = file.read()) != -1) {
			// System.out.print(result + " ");
			// System.out.println();
			System.out.print( result +" ");
		}
		
		file.seek(0);
		System.out.print(file.readLine());
		file.seek(0);
		//System.out.print(file.readUTF());
		file.close();
	}

}
