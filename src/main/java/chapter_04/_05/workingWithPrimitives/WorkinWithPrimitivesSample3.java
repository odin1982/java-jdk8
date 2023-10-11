package chapter_04._05.workingWithPrimitives;

import java.util.stream.Stream;

public class WorkinWithPrimitivesSample3 {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3);
		System.out.println(stream.mapToInt(x->x).average().getAsDouble());
	}
}
