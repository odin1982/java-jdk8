package chapter_03._01.genericsAndCollections._01.reviewingOcaCollections._02.searchingAndSorting;

import java.util.Arrays;

public class SearchinAndSortingTest {
	public static void main(String[] args) {
		int[] numbers = {6,9,1,8};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 6));
		System.out.println(Arrays.binarySearch(numbers, 3));
	}

}
