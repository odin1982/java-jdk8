package chapter_05.datesStringsLocalization._03.addingInternationalizationAndLocalization._05.formattingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterSample {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12,34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		System.out.println(shortDateTime.format(dateTime));
		System.out.println(shortDateTime.format(date));
		//System.out.println(shortDateTime.format(time));
		
		System.out.println();
		DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime.format(shortDateTime2));
		System.out.println(date.format(shortDateTime2));
		//System.out.println(time.format(shortDateTime2));
		
		System.out.println();
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		System.out.println(shortF.format(dateTime));
		System.out.println(mediumF.format(dateTime));
		
	}
}
