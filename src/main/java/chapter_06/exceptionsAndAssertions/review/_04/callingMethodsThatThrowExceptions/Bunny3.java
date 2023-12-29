package chapter_06.exceptionsAndAssertions.review._04.callingMethodsThatThrowExceptions;

public class Bunny3 {
	public static void main(String[] args){
		try {
			eatCarrot();
		} catch (NoMoreCarrotsException e) {
			System.out.println("Sad rabbit");
			e.printStackTrace();
		}
	}
	
	private static void eatCarrot() throws NoMoreCarrotsException {
		throw new NoMoreCarrotsException();
	}
}
