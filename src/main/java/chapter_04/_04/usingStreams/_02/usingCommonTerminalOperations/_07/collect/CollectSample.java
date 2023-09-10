package chapter_04._04.usingStreams._02.usingCommonTerminalOperations._07.collect;

import java.util.stream.Stream;

public class CollectSample {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("w","o","l","f");
		StringBuilder word = stream.collect(() -> new StringBuilder(),(k,v) -> k.append(v), (k,v) -> k.append(v));
		System.out.println(word);
		
		Stream<String> stream2 = Stream.of("w","o","l","f");
		StringBuilder word2 = stream2.collect(StringBuilder::new,StringBuilder::append, StringBuilder::append);
		System.out.println(word2);

	}
}
