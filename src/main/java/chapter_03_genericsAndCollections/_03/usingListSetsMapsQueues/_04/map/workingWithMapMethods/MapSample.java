package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._04.map.workingWithMapMethods;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("girafee", "leaf");
		String food =map.get("koala");
		System.out.println("koala: " + food);
		for(String key:map.keySet()) {
			System.out.println(key + ",");
		}
	}
}
