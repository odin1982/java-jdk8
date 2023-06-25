package chapter_03_genericsAndCollections._02.workingWithGenerics._05.upperBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Sample03 {
	static class Sparrow extends Bird{}
	static class Bird{}
	
	public static void main(String[] args) {
		List<? extends Bird> birds = new ArrayList<Bird>();
		birds.add(new Sparrow());
		birds.add(new Bird());
	}

}
