package chapter_01.pag_006.staticfinal.modifiers;

public abstract class Cat5 {
	static String name = "The Cat";
	static void clean() {}
}

class Lion5 extends Cat5{
	static void clean() {}
}
