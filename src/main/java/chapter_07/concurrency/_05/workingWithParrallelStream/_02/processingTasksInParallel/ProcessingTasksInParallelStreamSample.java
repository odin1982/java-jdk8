package chapter_07.concurrency._05.workingWithParrallelStream._02.processingTasksInParallel;

import java.util.Arrays;

public class ProcessingTasksInParallelStreamSample {
	public static void main(String[] args) {
		Arrays.asList(1,2,3,4,5,6).stream().forEach(s -> System.out.print(s + " "));
		System.out.println();
		Arrays.asList(1,2,3,4,5,6).parallelStream().forEach(s->System.out.print(s + " "));
		System.out.println();
		Arrays.asList(1,2,3,4,5,6).parallelStream().forEachOrdered(s->System.out.print(s + " "));
	}
}
