package chapter_03_genericsAndCollections._02.workingWithGenerics._05.upperBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Integer>();
		
		List<? extends Number> list2 = new ArrayList<Integer>();
	}
}
