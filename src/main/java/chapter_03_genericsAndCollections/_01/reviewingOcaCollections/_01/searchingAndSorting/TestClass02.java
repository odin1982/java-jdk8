package chapter_03_genericsAndCollections._01.reviewingOcaCollections._01.searchingAndSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestClass02 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,7,5,3);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 3));
		System.out.println(Collections.binarySearch(list, 2));
	}
}
