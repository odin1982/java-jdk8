package chapter_04._08.reviewQuestions._14;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1);
		IntStream is = s.mapToInt(x -> x);
		DoubleStream ds = s.mapToDouble(x -> x);
		Stream<Integer> s2 = ds.mapToInt(x -> x);
		s2.forEach(System.out::println);
	}
}
