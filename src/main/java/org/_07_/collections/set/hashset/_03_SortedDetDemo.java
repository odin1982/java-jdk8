package org._07_.collections.set.hashset;

import java.util.SortedSet;
import java.util.TreeSet;

public class _03_SortedDetDemo {
	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet<>();
		s.add(5);
		s.add(10);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(7);
		System.out.println("s: " + s);
		System.out.println("first element [s]: " + s.first());
		System.out.println("last element [s]: " + s.last());
		System.out.println("head set 4 [s]: " + s.headSet(4));
		System.out.println("tail set 3 [s]: " + s.tailSet(3));
		System.out.println("sub set 3,5 [s]: " + s.subSet(3,7));
		System.out.println(s.comparator()); 
		
		
	}

}
