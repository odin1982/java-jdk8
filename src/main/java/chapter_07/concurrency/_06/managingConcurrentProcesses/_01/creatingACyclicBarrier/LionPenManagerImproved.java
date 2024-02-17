package chapter_07.concurrency._06.managingConcurrentProcesses._01.creatingACyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManagerImproved {
	private void removeAnimals() {
		System.out.println("Removing animals");
	}

	private void cleanPen() {
		System.out.println("Cleaning the pen");
	}

	private void addAnimals() {
		System.out.println("Adding animals");
	}

	public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
		removeAnimals();
		try {
			c1.await();
			cleanPen();
			c2.await();
			addAnimals();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(4);
			LionPenManagerImproved manager = new LionPenManagerImproved();
			CyclicBarrier c1  = new CyclicBarrier(4);
			CyclicBarrier c2 = new CyclicBarrier(4,()->System.out.println("**** Pen cleaned!"));
			for (int i = 0; i < 4; i++)
				service.submit(() -> manager.performTask(c1,c2));

		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
