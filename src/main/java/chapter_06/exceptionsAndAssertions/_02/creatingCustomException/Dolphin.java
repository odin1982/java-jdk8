package chapter_06.exceptionsAndAssertions._02.creatingCustomException;

class CantSwimException extends Exception{}
class DangerInTheWater extends RuntimeException{}
class SharkInTheWaterException extends DangerInTheWater{}

public class Dolphin {
	public void swim() throws CantSwimException{
		//logic here
	}
}
