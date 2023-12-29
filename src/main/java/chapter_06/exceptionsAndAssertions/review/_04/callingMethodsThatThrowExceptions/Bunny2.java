package chapter_06.exceptionsAndAssertions.review._04.callingMethodsThatThrowExceptions;



public class Bunny2 {
	public static void main(String[] args) throws NoMoreCarrotsException{
		eatCarrot();
	}
	
	private static void eatCarrot() throws NoMoreCarrotsException {}
}
