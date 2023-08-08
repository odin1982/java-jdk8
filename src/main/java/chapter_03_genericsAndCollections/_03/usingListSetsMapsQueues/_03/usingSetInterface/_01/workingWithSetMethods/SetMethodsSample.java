package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._03.usingSetInterface._01.workingWithSetMethods;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethodsSample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66);
		boolean b2 = set.add(10);
		boolean b3 = set.add(66);
		boolean b4 = set.add(8);
		for(Integer integer: set) {
			System.out.print(integer+",");
		}
		System.out.println();
		Set<Integer> treeSet = new TreeSet<>();//treeset ordena
		boolean t1 = treeSet.add(66);
		boolean t2 = treeSet.add(10);
		boolean t3 = treeSet.add(66);
		boolean t4 = treeSet.add(8);
		for(Integer integer: treeSet) {
			System.out.print(integer+",");
		}
		
		
	}
}
