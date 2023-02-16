package chapter_03._01.genericsAndCollections._01.reviewingOcaCollections._01.arrayAndArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayAndArrayList2 {
	public static void main(String[] args) {
		String[] array = {"gerbil", "mouse"};
		List<String> list = Arrays.asList(array);
		list.set(1, "test");
		array[0] = "new";
		String[] array2 = (String[])list.toArray();
		list.remove(1);
	}

}
