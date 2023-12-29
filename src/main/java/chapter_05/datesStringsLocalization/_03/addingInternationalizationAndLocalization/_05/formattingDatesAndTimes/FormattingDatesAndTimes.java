package chapter_05.datesStringsLocalization._03.addingInternationalizationAndLocalization._05.formattingDatesAndTimes;

import java.time.LocalDate;
import java.time.Month;

public class FormattingDatesAndTimes {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());
	}
}
