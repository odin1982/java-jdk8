package chapter_07.concurrency._05.workingWithParrallelStream._02.processingTasksInParallel._02.understandingIndependentOperations;

import java.util.Arrays;

public class Sample2 {
	public static void main(String[] args) {
		Arrays.asList("jackal","kangaroo","lemur")
		.parallelStream()
		.map(s ->{ System.out.println(s);return s.toUpperCase(); })
		.forEach(System.out::println);
	}
}
