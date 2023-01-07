package practice;

public class Array_p {
	
	public static void main(String[] args) {
		int[] score = {10, 20, 30, 40, 50}; // 0 ~ 4
		int count = score.length;
		
		System.out.println(count); // 5
		
//		System.out.println(score[5]); // error
		System.out.println(score[score.length-1]); // 50
		
		
		String[] names = new String[2];
		
		System.out.println(names[0]); // null
		System.out.println(names[0].length()); // NullPointerException
	}
}
