package chapter_06.exceptionsAndAssertions.review._04.callingMethodsThatThrowExceptions._01.subclasses;

class CanNotHopException extends Exception{}

class Hopper{
	public void hop() {}
}

public class Bunny extends Hopper{
	public void hop() throws CanNotHopException{}
}
