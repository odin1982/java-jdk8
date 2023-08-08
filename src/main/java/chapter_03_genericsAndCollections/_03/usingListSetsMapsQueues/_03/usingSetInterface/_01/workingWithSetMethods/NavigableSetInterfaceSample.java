package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._03.usingSetInterface._01.workingWithSetMethods;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterfaceSample {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		for(int i=1;i<=20;i++) {
			set.add(i);
		}
		System.out.println(set.lower(10)); 		// < e
		System.out.println(set.floor(10));		// <= e
		System.out.println(set.ceiling(20));	// >= e
		System.out.println(set.higher(20));		// > e
	}

}
