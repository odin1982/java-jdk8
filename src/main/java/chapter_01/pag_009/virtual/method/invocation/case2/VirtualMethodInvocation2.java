package chapter_01.pag_009.virtual.method.invocation.case2;

abstract class Animal{
	String name= "???";
	public void printName() {
		System.out.println(name);
	}
}

class Lion extends Animal{
	String name = "Leo";
}



public class VirtualMethodInvocation2 {
	public static void main(String[] args) {
		Animal animal = new Lion();
		animal.printName();
	}
}
