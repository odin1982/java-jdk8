package chapter_02._02.implementingPolymorphism._01.castingObjectReferences;

import chapter_02._02.implementingPolymorphism.case02.Lemur;
import chapter_02._02.implementingPolymorphism.case02.Primate;

public class CastingTest {
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		Primate primate = lemur;
		
		//Lemur lemur2 = primate; // DOES NOT COMPILE
		Lemur lemur3 = (Lemur)primate;
		System.out.println(lemur3.age);
	}
}
