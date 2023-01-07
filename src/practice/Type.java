package practice;

public class Type {
	
	public static void main(String[] args) {
		// 정수
		int x = 30;
		long l = 30L; // int보다 큼
		short s = 30;
		byte b = 30;
		
//		int i = 30L; // error
		int i = (int)30L; 
		long ll = 30; // 자동 형변환
		
		double dd = 30.0; // float보다 큼
		float ff = 30.0f;
		
//		ff = dd; // error
		ff = (float)dd; // 강제 형변환
		dd = ff; // 자동 형변환
		
		boolean isMarried = true;
		isMarried = false;
		
		char c = 'a'; // char : 한글자만 사용 가능
		char cc = '한'; // char : 한글자만 사용 가능
		
		String str = "여러 글자";
		
		// %s = String
		// %d = Integer
		// %f = float
		System.out.printf("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.\n", "홍길동", 20, 180.5f);
		
		String str2 = String.format("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.", "홍길동", 20, 180.5f);
		System.out.println(str2);
		
		
		
		
	}
	
}
