package org._14_.collections.concurrent.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(0, "Basics");
		map.put(1, "Strong");
		map.put(0,"Tech");
		//map.remove(1);
		System.out.println(map);
		
		map.putIfAbsent(0, "Hello");
		System.out.println(map);
		
		map.remove(1,"Temp"); // Como no cuadra con el valor no lo elimina
		System.out.println(map);
		
		map.remove(1,"Strong");
		System.out.println(map);
		
		map.replace(0, "Techa", "Know");// Como no cuadra con el valor no lo modifica
		System.out.println(map);
		
		map.replace(0, "Tech", "Know");
		System.out.println(map);
		
		map.replace(0, "BasicsStrong");
		System.out.println(map);
	}

}
