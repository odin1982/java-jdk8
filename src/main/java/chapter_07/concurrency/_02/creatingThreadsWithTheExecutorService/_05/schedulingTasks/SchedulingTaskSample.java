package chapter_07.concurrency._02.creatingThreadsWithTheExecutorService._05.schedulingTasks;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulingTaskSample {
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Runnable task1 = () -> System.out.println("Hello Zoo");
		Callable<String> task2 = () -> "Monkey";
		Runnable task3 = () -> System.out.println("Hola Odin");
		Runnable task4 = () -> System.out.println("Se han ejecutado los hilos");
		Future<?> resut1 = service.schedule(task1, 10, TimeUnit.SECONDS);
		Future<?> resut2 = service.schedule(task2, 1, TimeUnit.MINUTES);
		
		ScheduledFuture<?> result3 = service.scheduleAtFixedRate(task3, 5, 1, TimeUnit.SECONDS);
		ScheduledFuture<?> result4 = service.scheduleAtFixedRate(task4, 5, 1, TimeUnit.MINUTES);
	}
}
