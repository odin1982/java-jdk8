package chapter_01.pag_006.staticfinal.modifiers;

public static abstract class Cat2 {//No permitido
	String name = "The Cat";
	void clean() {}
}

class Lion02 extends Cat2{
	void clean() {}
}


static class Tiger{ //No permitido
	
}
