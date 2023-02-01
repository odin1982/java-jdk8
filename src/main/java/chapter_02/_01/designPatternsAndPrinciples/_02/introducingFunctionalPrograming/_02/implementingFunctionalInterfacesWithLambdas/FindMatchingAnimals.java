package chapter_02._01.designPatternsAndPrinciples._02.introducingFunctionalPrograming._02.implementingFunctionalInterfacesWithLambdas;

public class FindMatchingAnimals {
	private static void print(Animal animal, CheckTrait trait) {
		if(trait.test(animal))
			System.out.println(animal);
	}
	
	public static void main(String[] args) {
		print(new Animal("fish",false,true),(Animal a) -> a.canHop());
		print(new Animal("kangaroo",true,false),(Animal a) -> a.canHop());
	}
}
