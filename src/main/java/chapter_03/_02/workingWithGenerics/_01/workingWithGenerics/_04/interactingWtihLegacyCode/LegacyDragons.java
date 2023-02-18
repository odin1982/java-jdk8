package chapter_03._02.workingWithGenerics._01.workingWithGenerics._04.interactingWtihLegacyCode;

import java.util.ArrayList;
import java.util.List;

public class LegacyDragons {
	public static void main(String[] args) {
		List unicorns = new ArrayList();
		unicorns.add(new Unicorn());
		printDragons(unicorns);
	}
	
	private static void printDragons(List<Dragon> dragons) {
		for(Dragon dragon: dragons) {
			System.out.println(dragon);
		}
	}
}
