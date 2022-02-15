package org._01_.arrays;

public class _008_AnonymousArray {
	public static void main(String[] args) {
		sum(new int[] {1,2,3});
	}

	private static void sum(int[] is) {
		int total = 0;
		for(int element: is) {
			total += element;
		}
		System.out.println("total -> " + total);
	}
}
