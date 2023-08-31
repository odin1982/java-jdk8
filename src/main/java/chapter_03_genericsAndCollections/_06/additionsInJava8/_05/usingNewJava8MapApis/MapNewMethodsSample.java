package chapter_03_genericsAndCollections._06.additionsInJava8._05.usingNewJava8MapApis;

import java.util.HashMap;
import java.util.Map;

public class MapNewMethodsSample {
	public static void main(String[] args) {
		Map<String,String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Jenny", "Tram");
		System.out.println(favorites);
	}
}
