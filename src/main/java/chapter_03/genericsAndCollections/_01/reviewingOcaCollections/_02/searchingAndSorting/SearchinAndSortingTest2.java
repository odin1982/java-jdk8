package chapter_03.genericsAndCollections._01.reviewingOcaCollections._02.searchingAndSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchinAndSortingTest2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,7,5,3);
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, 3));
		System.out.println(Collections.binarySearch(list, 2));
	}

}
