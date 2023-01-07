package practice;

public class Thread_p {
	
	public static void main(String[] args) {
		System.out.println("1");
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i< 5; i++) {
					try {
						Thread.sleep(1000); // 1초
						System.out.println(Thread.currentThread().getName() +":"+ i);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		// 람다식
		new Thread(()-> {
				for(int i = 0; i< 5; i++) {
					try {
						Thread.sleep(1000); // 1초
						System.out.println(Thread.currentThread().getName() +":"+ i);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
		}).start();
		
		System.out.println("2");
	}
}
