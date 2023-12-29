package simulador._02.advancedClassDesign._12;

enum Card{
	HEART,CLUB,SPADE,DIAMOND;
}


public class EnumTest {
	public static void main(String[] args) {
		for(Card c: Card.values())System.out.println(c + "");
	}
}
