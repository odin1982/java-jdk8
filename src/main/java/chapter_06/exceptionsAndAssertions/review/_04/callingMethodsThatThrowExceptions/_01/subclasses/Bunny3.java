package chapter_06.exceptionsAndAssertions.review._04.callingMethodsThatThrowExceptions._01.subclasses;

class Hopper3{
	public void hop() throws Exception{}
}
public class Bunny3 extends Hopper3{
	public void hop() throws CanNotHopException{}
}
