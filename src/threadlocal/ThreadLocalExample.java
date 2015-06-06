package threadlocal;

import java.util.Random;

public class ThreadLocalExample {
public static void main(String[] args) {
	final Random random = new Random();
	for(int i=1;i<=10;i++){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				int nextInt = random.nextInt();
				System.out.println(Thread.currentThread().getName()+" setting "+nextInt);
				MessageHolder.setMessage(nextInt+"");
				System.out.println(Thread.currentThread().getName()+" fetching "+MessageHolder.getMessage());
				
			}
		}).start();
	}
}
}
