package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._02.manipulatingDatesAndTimes;

import java.time.LocalDate;
import java.time.Month;

public class DateManipulator {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		date = date.plusDays(2);
		System.out.println(date);
		
		date = date.plusWeeks(2);
		System.out.println(date);
		
		date = date.plusMonths(1);
		System.out.println(date);
		
		date = date.plusYears(5);
		System.out.println(date);
	}
}
