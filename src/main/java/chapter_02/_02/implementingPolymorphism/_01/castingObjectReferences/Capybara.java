package chapter_02._02.implementingPolymorphism._01.castingObjectReferences;

public class Capybara extends Rodent{
	public static void main(String[] args) {
		Rodent rodent = new Rodent();
		Capybara capybara = (Capybara)rodent; // ClassCastException
	}
}
