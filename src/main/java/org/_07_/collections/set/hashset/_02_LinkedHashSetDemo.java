package org._07_.collections.set.hashset;

import java.util.LinkedHashSet;

public class _02_LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		LinkedHashSet<Object> lhs2 = new LinkedHashSet<>(30);
		LinkedHashSet<Object> lhs3 = new LinkedHashSet<>(20,1.0f);
		lhs.add(5);
		lhs.add(7);
		lhs.add(9);
		lhs.add(3);
		lhs.add(1);
		System.out.println("lhs: " + lhs);
		
		// Insertion order is not preserved
		// underlying data structure = combination of linked list and hashtable
	}

}
