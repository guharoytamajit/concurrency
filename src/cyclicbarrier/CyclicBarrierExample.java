package cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	public static void main(String[] args) {
		final CyclicBarrier barrier = new CyclicBarrier(5);
		for (int i = 1; i <= 5; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("Started:"
							+ Thread.currentThread().getName());
					try {
						barrier.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						e.printStackTrace();
					}
					System.out.println("Ending:"
							+ Thread.currentThread().getName());
				}
			}).start();
		}
	}
}
