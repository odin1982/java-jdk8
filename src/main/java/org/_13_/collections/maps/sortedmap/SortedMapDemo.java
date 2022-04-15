package org._13_.collections.maps.sortedmap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		NavigableMap<String, Integer> t = new TreeMap<>();
		t.put("ABC",123);
		t.put("DEF",123);
		t.put("HIJ",123);
		t.put("KLM",123);
		t.put("MNO",123);
		t.put("PQR",123);
		t.put("STU",123);
		t.put("VWX",123);
		t.put("YZA",123);
		
		System.out.println(t);
		
		// ceilingEntry
		// Returns a key-value mapping associated with the least keygreater than or equal to the given key, or null ifthere is no such key.
		System.out.println("ceilingEntry[HIJ]: " + t.ceilingEntry("HIJ"));
		
		// floorKey
		// Returns the greatest key less than or equal to the given key,or null if there is no such key.
		System.out.println("floorKey[pqr]: " + t.floorKey("PQR"));
		
		// higherKey
		// Returns the least key strictly greater than the given key, or null if there is no such key.
		System.out.println("higherKey[ABC]: " + t.higherKey("ABC"));
		
		// lowerKey
		// Returns the greatest key strictly less than the given key, or null if there is no such key.
		System.out.println("lowerKey[PQR]: " + t.lowerKey("PQR"));
		
		//ceilingKey
		// Returns the least key greater than or equal to the given key,or null if there is no such key.
		System.out.println("ceilingKey[VWX]: " + t.ceilingKey("VWX"));
		
		System.out.println("descendingKey: " + t.descendingMap());
		
		System.out.println("descendingMap: " + t.descendingMap());
		
		System.out.println(t.headMap("PQR"));
		
		System.out.println(t.headMap("PQR",true));
		
		System.out.println(t.subMap("KLM", "STU"));
		
		System.out.println(t.subMap("KLM",true, "STU",true));
		
		System.out.println(t.tailMap("KLM"));
		
		System.out.println(t.tailMap("KLM",false));
		
		System.out.println(t.higherKey("KLM"));
		
		System.out.println(t.navigableKeySet());
	}
}
