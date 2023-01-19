package chapter_01.workingWithEnums;

import java.util.Arrays;
import java.util.List;

public class SeasonExample {
	public static void main(String[] args) {
		Season s = Season.SUMMER;
		System.out.println(Season.SUMMER);
		System.out.println(s == Season.SUMMER);
		
		System.out.println("seasons");
		Arrays.asList(Season.values()).stream().forEach(season -> System.out.println(season + " " + season.ordinal()));
		
		// you can't compare an int with an Enum
		// if(Season.SUMMER == 2) {}
		
		Season season = Season.valueOf("FALL");
		System.out.println(season);
		
		
		// IllegalArgumentException
		Season seasonFail = Season.valueOf("marzo");
		
		
		
	}

}
