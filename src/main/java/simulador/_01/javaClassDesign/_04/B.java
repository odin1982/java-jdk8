package simulador._01.javaClassDesign._04;

class A{
	A(){ print(); }
	
	private void print() {System.out.println("A");}
}

public class B extends A{
	int i = Math.round(3.5f);
	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
	
	void print() { System.out.println(i);}
}
