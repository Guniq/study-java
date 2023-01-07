package practice;

public class Method_p {
	
	public static void main(String[] args) {
		System.out.println(add(50, 10));
		add(30, 10, 20);
		
		System.out.println(add(1, 2, 3, 4, 5));
	}
	
//	public static void add(int x, int y) { // return이 없을때
//		System.out.println(x + y);
//	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public static int add(int... numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
//			sum = sum + i;
			sum += i;
		}
		
		return sum;
	}
}
