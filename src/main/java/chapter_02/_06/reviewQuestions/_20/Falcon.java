package chapter_02._06.reviewQuestions._20;

interface Canfly{
	void fly();
}

interface HasWings{
	public abstract Object getWingSpan();
}

abstract class Falcon implements Canfly,HasWings{

}
