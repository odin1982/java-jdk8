package chapter_03._02.workingWithGenerics._01.workingWithGenerics._06.upperBoundedWildCards.case02;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildCard {
	static class Sparrow extends Bird{}
	static class Bird{}
	
	public static void main(String[] args) {
		List<? extends Bird> birds = new ArrayList<Bird>();
		birds.add(new Sparrow());
		birds.add(new Bird());
	}

}
