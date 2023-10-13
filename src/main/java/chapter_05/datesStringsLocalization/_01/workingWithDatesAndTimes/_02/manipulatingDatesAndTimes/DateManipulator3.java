package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._02.manipulatingDatesAndTimes;

import java.time.LocalDate;
import java.time.Month;

public class DateManipulator3 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		date = date.plusMinutes(1);
	}
}
