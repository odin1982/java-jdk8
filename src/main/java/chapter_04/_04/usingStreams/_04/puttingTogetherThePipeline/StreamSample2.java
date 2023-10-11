package chapter_04._04.usingStreams._04.puttingTogetherThePipeline;

import java.util.stream.Stream;

public class StreamSample2 {
	public static void main(String[] args) {
		Stream.generate(() -> "Elsa")
			.filter(n -> n.length() == 4)
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("------------- 2 --------------");
		//Out of memory error
//		Stream.generate(() -> "Elsa")
//			.filter(n -> n.length() == 4)
//			.sorted().limit(2)
//			.forEach(System.out::println);
		
		
	}
}
