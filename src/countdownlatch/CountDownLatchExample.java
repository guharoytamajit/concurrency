package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
public static void main(String[] args) throws InterruptedException {
	final CountDownLatch latch=new CountDownLatch(5);
	for(int i=1;i<=5;i++){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				latch.countDown();
				
			}
		}).start();
		
	}
		System.out.println("Main thread waiting..");
		latch.await();
		System.out.println("main thread completed");
}
}
