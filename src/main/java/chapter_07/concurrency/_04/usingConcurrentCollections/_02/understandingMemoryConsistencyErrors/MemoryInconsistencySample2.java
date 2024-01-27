package chapter_07.concurrency._04.usingConcurrentCollections._02.understandingMemoryConsistencyErrors;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryInconsistencySample2 {
	public static void main(String[] args) {
		Map<String,Object> foodData = new ConcurrentHashMap<String,Object>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		for(String key: foodData.keySet())
			foodData.remove(key);
	}
}
