package demo.java.util;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class UUIDDemo {

	public static void main(String[] args) {
		
		Random random = new Random();		
		int ch = random.nextInt(128);
		System.out.println(ch);
		System.out.println(UUID.fromString("131651-33-23-3-4"));
		System.out.println(UUID.randomUUID());
		
		System.out.println(new UUIDDemo().randomString(5));
		System.out.println(new UUIDDemo().createUniqueCode());
	}
	
	public String createUniqueCode() {
		Date date = new Date();
		String dateString = new DateDemo().formatDate("YYYYMMSS", date);
		String uuidString = UUID.randomUUID().toString().substring(0, 15);
		String randomString = randomString(5);
		
		return dateString + uuidString + randomString;
	}

	private String randomString(int length) {
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while(i<length){
			Random random = new Random();		
			char ch = (char)random.nextInt(128);
			if((ch>48 && ch<58) || (ch>65 && ch<123)){
				sb.append(ch);
				i++;
			}		
		}

		return sb.toString();
	}
}
