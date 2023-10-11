package chapter_04._05.workingWithPrimitives;

import java.util.stream.Stream;

public class WorkinWithPrimitivesSample {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2);
		System.out.println(stream.reduce(0,(s,n) -> s + n));
	}
}
