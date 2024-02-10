package chapter_07.concurrency._05.workingWithParrallelStream._01.creatingParallelStreams._02.parallelStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamSample {
	public static void main(String[] args) {
		Stream<Integer> parallelStream2 = Arrays.asList(1,2,3,4,5,6).parallelStream();
	}
}
