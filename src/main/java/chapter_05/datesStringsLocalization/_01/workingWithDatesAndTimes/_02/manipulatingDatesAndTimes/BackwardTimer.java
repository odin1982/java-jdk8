package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._02.manipulatingDatesAndTimes;

import java.time.LocalDateTime;

public class BackwardTimer {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		
		date = date.minusDays(1);
		System.out.println(date);
		
		date = date.minusHours(1);
		System.out.println(date);
		
		date = date.minusSeconds(10);
		System.out.println(date);
	}
}
