package chapter_07.concurrency._02.creatingThreadsWithTheExecutorService._04.waitingForResults;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResults {
	private static int counter = 0;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(()->{
				for(int i=0;i<500;i++) {
					CheckResults.counter++;
				} 
			});
			result.get(1,TimeUnit.SECONDS);
		}catch(TimeoutException e) {
			System.out.println("Not reached in time");
		}finally {
			if(service != null)service.shutdown();
		}
	}
}
