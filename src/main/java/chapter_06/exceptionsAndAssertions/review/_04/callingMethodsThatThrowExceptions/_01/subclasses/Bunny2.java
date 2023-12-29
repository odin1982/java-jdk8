package chapter_06.exceptionsAndAssertions.review._04.callingMethodsThatThrowExceptions._01.subclasses;

class Hopper2{
	public void hop() throws CanNotHopException{}
}
public class Bunny2 extends Hopper2{
	public void hop() {}
}
