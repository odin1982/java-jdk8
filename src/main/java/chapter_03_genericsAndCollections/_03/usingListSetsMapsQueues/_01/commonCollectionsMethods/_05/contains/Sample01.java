package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._01.commonCollectionsMethods._05.contains;

import java.util.List;

import utils.Factory;

/*
 * boolean contains(Object object)
 */
public class Sample01 {
	public static void main(String[] args) {
		List<String> birds = Factory.getArrayListOfStrings();
		birds.add("hawk");
		System.out.println(birds);
		System.out.println(birds.contains("hawk"));
		System.out.println(birds.contains("robin"));
	}
}
