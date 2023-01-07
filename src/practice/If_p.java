package practice;

public class If_p {
	
	public static void main(String[] args) {
		int i = 6;
		
		if(i < 3) {
			System.out.println("참");
		}else if(i < 5){
			System.out.println("거짓");
		}else {
			System.out.println("나머지");
		}
		
		boolean isMarried = true;
		boolean isMan = false;
		
		String str;
		
		str = isMarried ? "결혼 했다" : "결혼 안했다";
		System.out.println(str); // 결혼 했다
		
		if(isMarried && isMan) {
			str = "결혼 했다";
		}else {
			str = "결혼 안헀다";
		}
		
		
	}
}
