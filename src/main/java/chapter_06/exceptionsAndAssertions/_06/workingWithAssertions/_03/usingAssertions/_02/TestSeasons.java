package chapter_06.exceptionsAndAssertions._06.workingWithAssertions._03.usingAssertions._02;

import chapter_01.addingConstructorsFieldsMethodsEnum.case2.Season;

public class TestSeasons {
	public static void main(String[] args) {
		test(Seasons.WINTER);
	}
	
	public static void test(Seasons s) {
		switch(s) {
		case SPRING:
		case FALL:
			System.out.println("Shorter hours");
			break;
		case SUMMER:
			System.out.println("Longer hours");
			break;
		default:
			assert false:"Invalid season";
		}
	}
}
