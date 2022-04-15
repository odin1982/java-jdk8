package org._13_.collections.maps.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Object, Object> m = new TreeMap<>();
		SortedMap<Object, Object> s = new TreeMap<>();
		TreeMap<Object, Object> m2 = new TreeMap<>(m);
		
		Map<Object, Object> m4 = new HashMap<>();
		TreeMap<Object, Object> m3 = new TreeMap<>(m4);
		
		m.put(23, "");
		m.put(10,"");
		m.put(10,"Basics");
		m.put(11,"Strong");
		System.out.println(m);
	}

}
