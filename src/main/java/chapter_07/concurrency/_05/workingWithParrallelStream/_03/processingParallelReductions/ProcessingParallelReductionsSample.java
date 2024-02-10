package chapter_07.concurrency._05.workingWithParrallelStream._03.processingParallelReductions;

import java.util.Arrays;

public class ProcessingParallelReductionsSample {
	public static void main(String[] args) {
		System.out.println(Arrays.asList(1,2,3,4,5,6).stream().findAny().get());
		System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());
	}
}
