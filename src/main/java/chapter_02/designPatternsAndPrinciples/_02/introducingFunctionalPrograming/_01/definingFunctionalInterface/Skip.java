package chapter_02.designPatternsAndPrinciples._02.introducingFunctionalPrograming._01.definingFunctionalInterface;

public interface Skip extends Sprint{
	public default int getHopCount(Kangaroo kangaroo) {
		return 10;
	}
	
	public static void skip(int speed) {}

}
