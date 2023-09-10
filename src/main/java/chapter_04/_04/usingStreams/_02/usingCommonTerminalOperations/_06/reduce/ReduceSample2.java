package chapter_04._04.usingStreams._02.usingCommonTerminalOperations._06.reduce;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceSample2 {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3);
		Integer result = stream.reduce(1, (k,v) -> k*v);
		System.out.println(result);
		
		Stream<Integer> stream2 = Stream.of(1,2,3);
		Optional<Integer> result2 = stream2.reduce((k,v) -> k*v);
		System.out.println(result2);
		System.out.println(result2.get());
	}
}
