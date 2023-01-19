package chapter_01.usingEnumsSwitchStatements;

import chapter_01.workingWithEnums.Season;

public class EnumInSwitchExample {
	public static void main(String[] args) {
		Season summer = Season.SUMMER;
		switch(summer) {
		case WINTER:
			System.out.println("Get out the sled!");
			break;
		case SUMMER:
			System.out.println("Time for the pool!");
			break;
//		case 3:
//			System.out.println("does not compile");
		default:
			System.out.println("Is it summer yet?");
		}
	}
}
