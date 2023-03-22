package pag138.map;

import java.util.Map;
import java.util.TreeMap;

public class MapExample2 {
	public static void main(String[] args) {
		Map<String,String> map = new TreeMap<>();
		map.put("koala","bamboo");
		map.put("lion","meat");
		map.put("giraffe","leaf");
		String food = map.get("koala");
		System.out.println("food: " + food);
		for(String key: map.keySet())
			System.out.print(key + ",");
	}

}
