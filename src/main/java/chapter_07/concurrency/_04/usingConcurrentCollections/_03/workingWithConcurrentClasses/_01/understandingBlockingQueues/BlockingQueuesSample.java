package chapter_07.concurrency._04.usingConcurrentCollections._03.workingWithConcurrentClasses._01.understandingBlockingQueues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueuesSample {
	public static void main(String[] args) {
		try {
			BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
			blockingQueue.offer(39);
			blockingQueue.offer(3,4,TimeUnit.SECONDS);
			System.out.println(blockingQueue.poll());//Retrieves and removes the head of this queue, waiting up to thespecified wait time if necessary for an element to become available.
			System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
