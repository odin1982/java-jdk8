package chapter_03._02.workingWithGenerics._01.workingWithGenerics._06.upperBoundedWildCards;

import java.util.ArrayList;

public class UpperBoundedWildcards {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Integer>();
		
		// we need to use a wildcard
		
		ArrayList<? extends Number> list2 = new ArrayList<Integer>();
	}
	
	public static long total(List<? extends Number> list) {
		long count = 0;
		for(Number number : list)
			count += number.longValue();
		return count; 
	}
}
