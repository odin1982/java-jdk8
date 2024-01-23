package chapter_07.concurrency._03.synchronizingDataAccess._02.improvingAccessWithSynchronizedBlocks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager3 {
	private AtomicInteger sheepCount = new AtomicInteger(0);
	
	private synchronized void  incrementAndReport() {
			System.out.println(sheepCount.incrementAndGet()+" ");
	}
	
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			SheepManager3 manager = new SheepManager3();
			for(int i=0;i<10;i++) {
					service.submit(()-> manager.incrementAndReport());
			}
		}finally {
			if(service != null)service.shutdown();
		}
	}

}
