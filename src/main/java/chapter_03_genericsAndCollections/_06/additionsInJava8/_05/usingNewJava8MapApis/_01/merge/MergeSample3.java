package chapter_03_genericsAndCollections._06.additionsInJava8._05.usingNewJava8MapApis._01.merge;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;


/**
 * 
 * @author odina
 * @nota: En ningunmomento es llamado el BiFunction, si fuera asi provocaría un NullPointerException
 */
public class MergeSample3 {
	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1,v2) -> null;
		Map<String,String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Bus Tour");
		favorites.merge("Jenny","Skyride", mapper);
		favorites.merge("Sam","Skyride",mapper);
		
		System.out.println(favorites);
	}
}
