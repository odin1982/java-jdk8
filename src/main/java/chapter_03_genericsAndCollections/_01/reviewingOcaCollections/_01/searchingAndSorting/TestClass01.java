package chapter_03_genericsAndCollections._01.reviewingOcaCollections._01.searchingAndSorting;

import java.util.Arrays;

public class TestClass01 {
	public static void main(String[] args) {
		int[] numbers = {6,9,1,8};
		Arrays.sort(numbers);
		System.out.println(numbers);
		//pinta uno porque es la posicion en que se encuentra
		System.out.println(Arrays.binarySearch(numbers, 6));
		System.out.println(Arrays.binarySearch(numbers, 8));
		System.out.println(Arrays.binarySearch(numbers, 3));
	}
}
