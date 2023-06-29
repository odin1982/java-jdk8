package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._01.commonCollectionsMethods._04.clear;

import java.util.List;

import utils.Factory;

public class Sample01 {
	public static void main(String[] args) {
		List<String> birds = Factory.getArrayListOfStrings();
		System.out.println(birds);
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		birds.clear();
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
	}
}
