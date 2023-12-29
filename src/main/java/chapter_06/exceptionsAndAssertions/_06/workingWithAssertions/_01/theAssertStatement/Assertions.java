package chapter_06.exceptionsAndAssertions._06.workingWithAssertions._01.theAssertStatement;

public class Assertions {
	public static void main(String[] args) {
		int numGuests = -5;
		assert numGuests > 0;
		System.out.println(numGuests);
	}
}
