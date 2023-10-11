package chapter_04._05.workingWithPrimitives._01.creatingPrimitiveStreams;

import java.util.stream.IntStream;

public class WorkingWithPrimitivesSample3 {
	public static void main(String[] args) {
		IntStream count = IntStream.iterate(1,n -> n+1).limit(5);
		count.forEach(System.out::print);
		//System.out.println(count.sum());
		
		System.out.println();
		 
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::print);
		
		System.out.println();
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::print);
	}
}
