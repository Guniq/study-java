package practice;

public class While_p {
	
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println(i); // 0 ~ 9
			i++;
		}
		
		// do ~ while
		i = 0;
		do {
			System.out.println(i); // 0 ~ 9
			i++;
		}while(i < 10);
	}
}	
