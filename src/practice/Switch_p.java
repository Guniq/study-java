package practice;

public class Switch_p {
	
	public static void main(String[] args) {
		boolean isMarried = true;
		boolean isMan = false;
		
		String str;
		
		str = isMarried ? "결혼 했다" : "결혼 안했다";		
		
		switch(str) {
			case "결혼 했다":
				System.out.println("O");
				break;
				
			case "결혼 안했다":
				System.out.println("X");
				break;
				
			default:
				System.out.println("?");
		}
		System.out.println(str);
	}
}
