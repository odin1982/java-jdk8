package chapter_01.pag_006.staticfinal.modifiers;

public final abstract class Cat3 {//La combinacion de abstracto con final no es permitida es una por si sola pero no ambas
	String name = "The Cat";
	void clean() {}
}

final class Lion3 extends Cat3{
	void clean() {}
}


final class Tiger3{ //No permitido
	
}
