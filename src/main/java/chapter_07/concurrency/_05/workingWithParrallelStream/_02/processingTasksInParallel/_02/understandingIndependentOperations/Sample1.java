package chapter_07.concurrency._05.workingWithParrallelStream._02.processingTasksInParallel._02.understandingIndependentOperations;

import java.util.Arrays;

public class Sample1 {
	public static void main(String[] args) {
		Arrays.asList("jackal","kangaroo","lemur")
		.parallelStream()
		.map(s -> s.toUpperCase())
		.forEach(System.out::println);
	}
}
