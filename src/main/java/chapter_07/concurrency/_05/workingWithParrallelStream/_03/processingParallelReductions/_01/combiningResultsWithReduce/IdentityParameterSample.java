package chapter_07.concurrency._05.workingWithParrallelStream._03.processingParallelReductions._01.combiningResultsWithReduce;

import java.util.Arrays;

public class IdentityParameterSample {
	public static void main(String[] args) {
		System.out.println(Arrays.asList("w","o","l","f").parallelStream().reduce("X", String::concat));
	}
}
