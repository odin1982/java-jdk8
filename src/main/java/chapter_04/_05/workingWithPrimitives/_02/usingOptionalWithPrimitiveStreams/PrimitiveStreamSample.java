package chapter_04._05.workingWithPrimitives._02.usingOptionalWithPrimitiveStreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class PrimitiveStreamSample {
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1,10);
		OptionalDouble optional = stream.average();
		System.out.println(optional);
		optional.ifPresent(System.out::println);
		System.out.println(optional.getAsDouble());
		System.out.println(optional.orElseGet(()->Double.NaN));
	}
}
