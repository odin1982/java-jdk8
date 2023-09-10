package chapter_04._04.usingStreams._02.usingCommonTerminalOperations._06.reduce;

import java.util.stream.Stream;

public class ReduceSample {
	public static void main(String[] args) {
		String[] array = new String[] {"w","o","l","f"};
		String result = "";
		for(String s : array) {
			result = result + s;
		}
		System.out.println(result);
		
		Stream<String> stream = Stream.of("w","o","l","f");
		String word = stream.reduce("", (k,v) -> k+v);
		System.out.println(word);
		
		Stream<String> stream2 = Stream.of("w","o","l","f");
		String word2 = stream2.reduce("", (k,v) -> k.concat(v));
		System.out.println(word2);
		
		Stream<String> stream3 = Stream.of("w","o","l","f");
		String word3 = stream3.reduce("", String::concat);
		System.out.println(word3);
	}
}
