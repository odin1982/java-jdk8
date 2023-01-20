package chapter_01.creatingNestedClasses.localInnerClasses;

public class EffectivelyFinal {
	
	public void isItFinal() {
		int one = 20; // efectively final
		int two = one; // not effectively final
		two++;
		int three; //effectively final
		if(one == 4) three = 3;
		else three = 4;
		int four = 4; // not effectively final
		class Inner{}
		four = 5;
	}

}
