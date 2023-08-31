package chapter_04._01.usingVariablesInLambdas;

interface Gorilla{ String move(); }
public class GorillaFamily {
	String walk = "walk";
	
	void play(Gorilla g) {
		System.out.println(g.move());
	}
	
	void everyonePlay(boolean baby) {
		String aproach = "amble";
		//aproach = "run";
		play(() -> walk);
		play(() -> baby ? "hitch a ride" : "run");
		play(() -> aproach);
		
	}
}
