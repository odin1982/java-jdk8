package chapter_06.exceptionsAndAssertions.review._04.callingMethodsThatThrowExceptions._01.subclasses;
class Hopper4{
	public void hop() {}
}

public class Bunny4 extends Hopper4{
	public void hop() throws IllegalStateException{}
}
