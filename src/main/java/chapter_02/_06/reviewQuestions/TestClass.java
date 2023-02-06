package chapter_02._06.reviewQuestions;

interface CanClimb{
	public abstract void climb();
}

interface CanClimbTrees extends CanClimb{}

abstract class Chipmunk implements CanClimbTrees{
	public abstract void chew();
}

class EasterChipmunk extends Chipmunk{
	public void chew() {
		System.out.println("Eastern Chipmunk is Chewing");
	}
}

public class TestClass {
	
}
