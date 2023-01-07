package practice;

import java.util.Random;

public class Random_p {

	public static void main(String[] args) {
		Random random = new Random();
//		int rand = random.nextInt(10); // 0 ~ 9
		int rand = random.nextInt(4) + 5; // 5 ~ 9
		
		System.out.println(rand);
	}
}
