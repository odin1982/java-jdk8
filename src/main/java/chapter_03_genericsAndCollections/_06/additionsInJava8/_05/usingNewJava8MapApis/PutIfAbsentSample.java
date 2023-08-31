package chapter_03_genericsAndCollections._06.additionsInJava8._05.usingNewJava8MapApis;

import java.util.HashMap;

public class PutIfAbsentSample {
	public static void main(String[] args) {
		HashMap<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "BusTour");
		favorites.put("Tom", null);
		
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		System.out.println(favorites);
	}
}
