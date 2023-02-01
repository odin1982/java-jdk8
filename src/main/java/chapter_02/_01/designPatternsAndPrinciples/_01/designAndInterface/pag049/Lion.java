package chapter_02._01.designPatternsAndPrinciples._01.designAndInterface.pag049;

public class Lion implements Run{
	public boolean isQuadruped() {
		return true;
	}
	
	public boolean canHuntWhileRunning() {
		return true;
	}
	
	public double getMaxSpeed() {
		return 100;
	}
}
