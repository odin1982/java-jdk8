package simulador._03.genericsAndCollections._02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String,List<? extends CharSequence>> stateCitiesMap = new HashMap<String,List<? extends CharSequence>>();
		Map<String,List<? extends CharSequence>> stateCitiesMap = new HashMap<String,List<>>();
		Map<String,List<? extends CharSequence>> stateCitiesMap2 = new HashMap<>();
		Map<String,List<? extends CharSequence>> stateCitiesMap3 = new HashMap<<>>();
	}
}
