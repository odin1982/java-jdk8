package pag_138.map.workingWithMapMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {
	public static void main(String[] args) {
		Map<String,Integer> m = createMapElement();
		System.out.println("m:" + m);
		m.clear();
		System.out.println("m: " + m);
		boolean empty = m.isEmpty();
		System.out.println("m is empty:" + empty);
		m = createMapElement();
		System.out.println("m size:" + m.size());
		Integer integer = m.get("CR7");
		System.out.println("CR7:" + integer);
		m.put("Odin",10);
		System.out.println(m);
		Collection<Integer> values = m.values();
		System.out.println(values);
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		
	}
	
	private static Map<String,Integer> createMapElement() {
		Map<String,Integer> m = new HashMap<>();
		m.put("Messi",1);
		m.put("CR7",2);
		m.put("Ronaldo",3);
		m.put("Ochoa",4);
		m.put("Montes",5);
		m.put("Moreno",6);
		return m;
	}
}
