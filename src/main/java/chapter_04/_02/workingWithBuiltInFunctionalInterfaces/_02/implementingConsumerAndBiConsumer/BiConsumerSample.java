package chapter_04._02.workingWithBuiltInFunctionalInterfaces._02.implementingConsumerAndBiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		BiConsumer<String,Integer> b1 = (k,v) -> map.put(k, v);
		BiConsumer<String,Integer> b2 = map::put;
		
		b1.accept("dog", 1);
		b2.accept("chicken", 2);
		
		System.out.println(map);
		
		
		Map<String,String> map2 = new HashMap<>();
		BiConsumer<String,String> b3 = (k,v) -> map2.put(k, v);
		BiConsumer<String,String> b4 = map2::put;
		
		b3.accept("beisbol","EU");
		b4.accept("soccer", "Mexico");
		System.out.println(map2);
	}
}
