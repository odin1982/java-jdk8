package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author odina
 * @nota Map no usa add usa el metodo put
 */
public class TestClass09 {
	public static void main(String[] args) {
		Map<String,Double> map = new HashMap<>();
		map.add("pi",3.14159);
		map.add("e",2L);
	}
}
