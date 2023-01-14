package chapter_01.annotatingOverridingMethods.case2;

class Bobcat{
	public void findDen() {}
}

// L10: marca error porque no esta sobreescribiendo el metodo, no esta cumpliendo con las reglas de sobreescritura
public class BobcatMother extends Bobcat{
	@Override
	public void findDen(boolean b) {}
}
