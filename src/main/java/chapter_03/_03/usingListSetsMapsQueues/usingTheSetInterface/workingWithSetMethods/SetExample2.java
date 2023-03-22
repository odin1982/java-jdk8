package chapter_03._03.usingListSetsMapsQueues.usingTheSetInterface.workingWithSetMethods;

import java.util.Set;
import java.util.TreeSet;

// ejecuta Comparable interface
public class SetExample2 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		boolean b1 = set.add(66);
		boolean b2 = set.add(10);
		boolean b3 = set.add(66);
		boolean b4 = set.add(8);
		
		for(Integer entero: set) {
			System.out.println(entero);
		}
	}
}
