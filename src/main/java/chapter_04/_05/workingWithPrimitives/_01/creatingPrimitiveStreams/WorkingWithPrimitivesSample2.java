package chapter_04._05.workingWithPrimitives._01.creatingPrimitiveStreams;

import java.util.stream.DoubleStream;

public class WorkingWithPrimitivesSample2 {
	public static void main(String[] args) {
		DoubleStream random = DoubleStream.generate(Math::random);
		DoubleStream fractions = DoubleStream.iterate(.5,d->d/2);
		
		random.limit(3).forEach(System.out::println);
		System.out.println();
		fractions.limit(3).forEach(System.out::println);
	}
}
