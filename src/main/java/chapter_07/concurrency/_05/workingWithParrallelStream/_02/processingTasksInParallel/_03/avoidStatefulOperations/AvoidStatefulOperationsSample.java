package chapter_07.concurrency._05.workingWithParrallelStream._02.processingTasksInParallel._03.avoidStatefulOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AvoidStatefulOperationsSample {
	public static void main(String[] args) {
		List<Integer> data = Collections.synchronizedList(new ArrayList<>());
		Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.map(i -> {data.add(i);return i;})// AVOID STATEFUL LAMBA EXPRESSIONS
		.forEachOrdered(i -> System.out.println(i+" "));
		
		System.out.println();
		for(Integer e: data) {
			System.out.println(e + " ");
		}
	}
}
