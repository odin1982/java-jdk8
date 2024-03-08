package mx.codewars.explanation.arraysObject.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysObject {
	public static void main(String[] args) {
		arraysStreamExaplnation();
	}
	
	
	/**
	 * public static <T> Stream<T> stream(T[] array,
                                   int startInclusive,
                                   int endExclusive)  //no incluye este elemento
	 */
	public static void arraysStreamExaplnation() {
		String[] numbers = new String[5];
		numbers[0]="1";
		numbers[1]="2";
		numbers[2]="3";
		numbers[3]="4";
		numbers[4]="5";
		
		Stream<String> streamNumbers = Arrays.stream(numbers, 1, numbers.length);
		streamNumbers.forEach(System.out::println);
	}
}
