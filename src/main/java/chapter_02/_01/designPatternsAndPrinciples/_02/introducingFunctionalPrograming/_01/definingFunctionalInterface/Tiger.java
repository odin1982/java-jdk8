package chapter_02._01.designPatternsAndPrinciples._02.introducingFunctionalPrograming._01.definingFunctionalInterface;

public class Tiger implements Sprint{

	@Override
	public void sprint(Animal animal) {
		System.out.println("Animal is sprinting fast! " + animal.toString());
	}

}
