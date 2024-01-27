package chapter_07.concurrency._04.usingConcurrentCollections._04.obtainingSinchronizedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConcurrentModificationExceptionSample {
	public static void main(String[] args) {
		Map<String,Object> foodData = new HashMap<String,Object>();
		foodData.put("penguin",1);
		foodData.put("flamingo",2);
		
		Map<String,Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
		for(String key: synchronizedFoodData.keySet())
			synchronizedFoodData.remove(key);
	}
}
