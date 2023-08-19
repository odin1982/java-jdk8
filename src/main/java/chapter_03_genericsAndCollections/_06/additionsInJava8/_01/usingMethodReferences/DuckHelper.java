package chapter_03_genericsAndCollections._06.additionsInJava8._01.usingMethodReferences;

import java.util.Comparator;

import chapter_03_genericsAndCollections._04.comparatorVsComparable._02.comparator.Duck;

public class DuckHelper {
	public static int comparebyWeight(Duck d1,Duck d2) {
		return d1.getWeight() - d2.getWeight();
	}
	
	public static int compareByName(Duck d1,Duck d2) {
		return d1.getName().compareTo(d2.getName());
	}
	
	public static void main(String[] args) {
	 Comparator<Duck> byWeight = (d1,d2) -> DuckHelper.comparebyWeight(d1, d2);
	 Comparator<Duck> byName = DuckHelper::compareByName;
	} 
	

}
