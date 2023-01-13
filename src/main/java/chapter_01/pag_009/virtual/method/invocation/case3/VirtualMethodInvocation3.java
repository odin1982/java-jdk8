package chapter_01.pag_009.virtual.method.invocation.case3;

abstract class Animal{
	public void careFor() {
		play();
	}
	
	public void play() {
		System.out.println("pet animal");
	}
}

class Lion extends Animal{
	public void play() {
		System.out.println("toss in meat");
	}
}

public class VirtualMethodInvocation3 {
	public static void main(String[] args) {
		Animal animal = new Lion();
		animal.careFor();
	}
}
