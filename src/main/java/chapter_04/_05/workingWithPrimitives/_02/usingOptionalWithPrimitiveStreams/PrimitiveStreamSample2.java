package chapter_04._05.workingWithPrimitives._02.usingOptionalWithPrimitiveStreams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class PrimitiveStreamSample2 {
	public static void main(String[] args) {
		LongStream longs = LongStream.of(5,10);
		long sum = longs.sum();
		System.out.println(sum);
		DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
		OptionalDouble min = doubles.min();
	}
}
