package org._07_.collections.set.hashset;

import java.util.HashSet;

public class _01_HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Object> hs2 = new HashSet<>(30);
		HashSet<Object> hs3 = new HashSet<>(100,.80f);
		HashSet<Object> hs4 = new HashSet<>(hs); // new HashSet<>(Collection c)
		hs.add(new Integer("7"));
		hs.add(new Integer("2"));
		hs.add(new Integer("3"));
		hs.add(new Integer("9"));
		hs.add(new Integer("5"));
		System.out.println("hs: " + hs);
		
	}

}
