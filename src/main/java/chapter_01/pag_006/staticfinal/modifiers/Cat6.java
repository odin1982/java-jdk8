package chapter_01.pag_006.staticfinal.modifiers;

public abstract class Cat6 {
	final String name = "The Cat";
	final void clean() {}
}

class Lion extends Cat6{
	void clean() {}
}
