package jdk8._09_;

class Book{
	protected final int pages = 100;
	
	final void mA() {
		System.out.println("In B.mA " + pages);
	}
}

class Encyclopedia extends Book{
	private int pages = 200;
	void mB() {
		System.out.println("In E.mB " + pages);
	}
	
	void mA() {
		System.out.println("In E.mA " + pages);
	}
}


public class TestClass {
	public static void main(String[] args) {
		Book o1 = new Encyclopedia();
		Book o2 = new Book();
		o1.mA();
		o1.mB();
	}
}


// El metodo final void mA() L-6 es final no se puede sobreescribir
// o1.mB()	-	No se puede usar ya que el objeto Book no implementa ese m�todo