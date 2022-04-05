package org._12_.collections.maps.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String args[]) {
		HashMap<Integer, String> m = new HashMap<>();
		m.put(10, "First");
		m.put(10, "Second");
		System.out.println(m);
		
		IdentityHashMap<Integer, String> m2 = new IdentityHashMap<>();
		Integer integerA = new Integer(10);
		Integer integerB = new Integer(10);
		Integer integerC = integerA;
		
		m2.put(10, "First");
		m2.put(10, "Second");
		m2.put(integerA,"Integer A"); // tiene la misma referencia que integerC
		m2.put(integerB,"Integer B");
		m2.put(integerC,"Integer C"); // tiene la misma referencia que integerA
		System.out.println(m2);
	}

}
