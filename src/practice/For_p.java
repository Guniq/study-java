package practice;

public class For_p {
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i); // 0 ~ 9
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i); 
			if(i == 6) {
				break; 
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i); 
			if(i == 6) {
				continue; // 6일때 출력x : 0,1,2,3,4,5,7,8,9
			}
		}
	}
}	
