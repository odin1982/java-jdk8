package chapter_03._03.usingListSetsMapsQueues.usingTheSetInterface.workingWithSetMethods;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66);
		boolean b2 = set.add(10);
		boolean b3 = set.add(66);
		boolean b4 = set.add(8);
		
		for(Integer entero: set) {
			System.out.println(entero);
		}
	}
}
