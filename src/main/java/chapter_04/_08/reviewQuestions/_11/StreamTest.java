package chapter_04._08.reviewQuestions._11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		System.out.println(Stream.iterate(1,x->++x).limit(5).map(x -> ""+x).collect(Collectors.joining()));
	}
}
