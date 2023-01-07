package jdk8._001_.assesment.test._003;

interface HasTail{ int getTailLength();}
abstract class Puma implements HasTail{
	protected int getTailLength() { return 4;} //No se puede reducir la visibilidad
}
public class Cougar extends Puma{
	public static void main(String[] args) {
		Puma puma = new Puma();
		System.out.println(puma.getTailLength());
	}
	
	public int getTailLength(int length) {return 2;}

}
