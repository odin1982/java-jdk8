package simulador._01.javaClassDesign._01;

public class Encyclopedia extends Book{
	private int pages = 200;
	
	void mB() {
		System.out.println("In E.mB " + pages);
	}
	
	//El objeto padre indica que no se puede sobreescribir el metodo mA()
	void mA() {
		System.out.println("In E.mA " + pages);
	}
	
	public static void main(String[] args) {
		Book o1 = new Encyclopedia();
		Book o2 = new Book();
		o1.mA();
		o1.mB();
		o2.mA();
	}
}
