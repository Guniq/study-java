package practice;

import java.util.ArrayList;

public class ArrayList_p {

	public static void main(String[] args) {
		ArrayList<Integer> scoreList = new ArrayList<>();
		
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		
		scoreList.add(2, 200); // [10, 20, 200, 30, 40, 50]
		scoreList.remove(2); // [10, 20, 30, 40, 50]
		
		System.out.println(scoreList.size()); // 5
		System.out.println(scoreList.get(4)); // 50
//		System.out.println(scoreList.get(5)); // error
		System.out.println(scoreList); 
	}
}
