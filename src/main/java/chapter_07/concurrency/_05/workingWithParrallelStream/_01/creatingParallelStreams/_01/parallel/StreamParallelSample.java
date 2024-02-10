package chapter_07.concurrency._05.workingWithParrallelStream._01.creatingParallelStreams._01.parallel;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamParallelSample {
	public static void main(String[] args) {
		Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
		Stream<Integer> parallelStream = stream.parallel();
	}
}
