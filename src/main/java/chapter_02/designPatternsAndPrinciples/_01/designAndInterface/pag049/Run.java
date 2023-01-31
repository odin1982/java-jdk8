package chapter_02.designPatternsAndPrinciples._01.designAndInterface.pag049;

public interface Run extends Walk{
	public abstract boolean canHuntWhileRunning();
	abstract double getMaxSpeed();
}
