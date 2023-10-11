package chapter_04._08.reviewQuestions._13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = Arrays.asList(4,5,6);
		List<Integer> l3 = Arrays.asList();
		//El metodo map espera un Integer no una Lista de enteros por eso hay un error en el codigo
		Stream.of(l1,l2,l3).map(x -> x+1).flatMap(x -> x.stream()).forEach(System.out::println);
	}
}
