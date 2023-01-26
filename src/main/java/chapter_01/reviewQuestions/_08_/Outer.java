package chapter_01.reviewQuestions._08_;

public class Outer {
	private int x = 5;
	
	// Eror compilacion: no se pueden declarar variables estaticas dentro de una clase anidada que no sea estatica
	// en una clase anidada estatica si se permiten metodos y varibales estaticas
	protected class Inner{
		public static int x = 10;
		public void go() { System.out.println(x);}
	}
	
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.go();
	}
}
