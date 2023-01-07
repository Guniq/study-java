package practice;

public class Generic_p {
	
	public static void main(String[] args) {
		print("안녕~");
		print(1);
		print(1L);
		print(true);
	}
	
	public static <T> void print(T type) {
		System.out.println(type);
	}
}
