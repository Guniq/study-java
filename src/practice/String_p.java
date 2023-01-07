package practice;

public class String_p {
	
	public static void main(String[] args) {
		String str = "100";
		int i = Integer.parseInt(str); // 숫자로 변환
		long l = Long.parseLong(str); 
		
		String str2 = String.valueOf(i); // 문자로 변환
		
		System.out.println(i);
		System.out.println(str2);
	}
}
