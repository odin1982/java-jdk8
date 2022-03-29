package org._12_.collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		Map map2 = new HashMap();
		HashMap mapWithInitialCapacity = new HashMap(20);
		HashMap map3 = new HashMap(map);
		
		HashMap<String, Integer> m = new HashMap<>();
		m.put("Science", 90);
		m.put("Maths", 80);
		m.put("English", 90);
		
		System.out.println(m);
	}

}
