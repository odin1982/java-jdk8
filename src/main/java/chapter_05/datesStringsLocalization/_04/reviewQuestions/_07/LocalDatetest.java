package chapter_05.datesStringsLocalization._04.reviewQuestions._07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2018-04-30",DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
		date.plusHours(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}
}
