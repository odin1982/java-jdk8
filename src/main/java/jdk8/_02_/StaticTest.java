package jdk8._02_;

// Lo bloques estaticos se ejecutaran una vez ya sea referenciada la clase:
// StaticTest st1;
// ó instanciada
// st1 = new StaticTest();

public class StaticTest {
	static {
		System.out.println("In Static");
	}
	
	{
		System.out.println("In non -static");
	}
	
	public static void main(String[] args) {
		StaticTest st1;
		System.out.println(" 1 ");
		st1 = new StaticTest();
		System.out.println(" 2 ");
		StaticTest st2 = new StaticTest();
	}
}
