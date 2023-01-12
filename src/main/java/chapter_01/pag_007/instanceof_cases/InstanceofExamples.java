package chapter_01.pag_007.instanceof_cases;

class HeavyAnimal{}
class Hippo extends HeavyAnimal{}
class Elephant extends HeavyAnimal{}


class Tiger{}
class Bear{}

interface Mother{}



public class InstanceofExamples {
	public static void main(String[] args) {
		HeavyAnimal hippo = new Hippo();
		boolean b1 = hippo instanceof Hippo;
		boolean b2 = hippo instanceof HeavyAnimal;
		boolean b3 = hippo instanceof Elephant;
		boolean b4 = hippo instanceof Object;
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		System.out.println("b3: " + b3);
		System.out.println("b4: " + b4);
		
		Hippo nullHippo = null;
		boolean b5 = nullHippo instanceof Object;
		//boolean b6 = hippo instanceof nullHippo;
		//boolean b7 = hippo instanceof null;
		
		Hippo anotherHippo = new Hippo();
		boolean b8 = hippo instanceof Elephant;
		
		
		Tiger tiger = new Tiger();
		boolean b9 = tiger instanceof Bear;// Error de compilación ya que no hay ninguna referencia entre uno y otro
		
		boolean b10 = tiger instanceof Mother; //cuando compara una interface no hay problema
	}
}
