package chapter_01.pag_009.virtual.method.invocation.case1;

import chapter_01.pag_009.virtual.method.invocation.case2.Animal;

abstract class Animal{
	public abstract void feed();
}

class Cow extends Animal{
	@Override
	public void feed() { addHay(); }
	private void addHay() {}
}

class Bird extends Animal{
	@Override
	public void feed() { addSeed(); }
	private void addSeed() {}
}

class Lion extends Animal{
	@Override
	public void feed() { addMeat(); }
	private void addMeat() {}
}

public class VirtualMethodInvocation {

}
