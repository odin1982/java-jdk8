package chapter_04._08.reviewQuestions._08;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamTest {
	public static void main(String[] args) {
		IntStream is = IntStream.empty();
		is.average();
		OptionalDouble average = is.average();
		is.findAny();
		OptionalInt findAny = is.findAny();
		int sum = is.sum();
	}
}
