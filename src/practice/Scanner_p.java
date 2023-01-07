package practice;

import java.util.Scanner;

public class Scanner_p {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next(); // 문자로 받음
		int i = scanner.nextInt(); // 숫자로 받음
		long l = scanner.nextLong();
		
		System.out.println(scanner.next()); 
	}
}
