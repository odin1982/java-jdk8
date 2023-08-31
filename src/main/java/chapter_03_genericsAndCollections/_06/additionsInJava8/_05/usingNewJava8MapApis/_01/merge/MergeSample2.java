package chapter_03_genericsAndCollections._06.additionsInJava8._05.usingNewJava8MapApis._01.merge;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;


/**
 * 
 * @author odina
 * @nota: En ningunmomento es llamado el BiFunction, si fuera asi provocar�a un NullPointerException
 */
public class MergeSample2 {
	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1,v2) -> v1.length() > v2.length() ? v1 : v2;
		Map<String,String> favorites = new HashMap<>();
		favorites.put("Sam", null);
		
		// merge(key,value,BiFunction) 
		String jenny = favorites.merge("Jenny","Skyride",mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		
		System.out.println(favorites);
		System.out.println(jenny);
		System.out.println(tom);
	}
}
