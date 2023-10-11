package chapter_04._08.reviewQuestions._01;

import java.util.stream.Stream;


//No existe operacion terminal unicamente se imprime el hash de la clase
public class StreamTest {
	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		System.out.println(stream.limit(2).map(x -> x + "2"));
	}
}
