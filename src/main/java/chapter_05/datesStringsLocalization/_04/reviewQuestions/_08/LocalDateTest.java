package chapter_05.datesStringsLocalization._04.reviewQuestions._08;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}
}
