package chapter_02._06.reviewQuestions._10;

public interface CanRun {
	public default void walk() { System.out.println("walking");}
	public abstract void run();
}
