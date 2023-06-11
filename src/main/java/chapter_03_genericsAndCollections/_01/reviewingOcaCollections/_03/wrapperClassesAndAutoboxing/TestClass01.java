package chapter_03_genericsAndCollections._01.reviewingOcaCollections._03.wrapperClassesAndAutoboxing;

import java.util.ArrayList;
import java.util.List;

public class TestClass01 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(new Integer(3));
		numbers.add(new Integer(5));
		/**
		 * 	remove(int index)
			Removes the element at the specified position in this list (optional operation).
		 */
		numbers.remove(1);
		/**
		 * 	remove(Object o)
			Removes the first occurrence of the specified element from this list, if it is present (optional operation).
		 */
		numbers.remove(new Integer(5));
		System.out.println(numbers);
	}
}
