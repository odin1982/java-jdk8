package chapter_07.concurrency._05.workingWithParrallelStream._03.processingParallelReductions._01.combiningResultsWithReduce;

import java.util.Arrays;

public class CombiningResultWithReduce {
	public static void main(String[] args) {
		System.out.println(Arrays.asList('w','o','l','f').stream().reduce("",(c,s1) -> c + s1,(s2,s3) -> s2 + s3));
	}
}
