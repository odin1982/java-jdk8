package chapter_01.reviewQuestions._06_;

public class FlavorsEnum {
	enum Flavors{
		VAINILLA,CHOCOLATE, STRAWBERRY
	}
	
	public static void main(String[] args) {
		System.out.println(Flavors.CHOCOLATE.ordinal());
	}

}
