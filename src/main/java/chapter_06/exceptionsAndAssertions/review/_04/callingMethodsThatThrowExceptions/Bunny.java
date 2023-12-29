package chapter_06.exceptionsAndAssertions.review._04.callingMethodsThatThrowExceptions;



public class Bunny {
	public static void main(String[] args) {
		eatCarrot();
	}
	
	private static void eatCarrot() throws NoMoreCarrotsException {}
}
