package chapter_06.exceptionsAndAssertions.review._04.callingMethodsThatThrowExceptions._02.printingAnException;

public class ThreeWaysPrintingAnExceptionSample {
	public static void main(String[] args) {
		try {
			hop();
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
