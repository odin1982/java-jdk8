package chapter_01.annotatingOverridingMethods.case1;

class Bobcat{
	public void findDen() {}
}

// L8: Indica que estas tratando de sobreescribir otro metodo
public class BobcatMother extends Bobcat{
	@Override
	public void findDen() {}
}
