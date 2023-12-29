package chapter_05.datesStringsLocalization._04.reviewQuestions._11;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimeTest {
	public static void main(String[] args) {
		LocalDateTime d = LocalDateTime.of(2015, 5,10,11,22,33);
		Period p = Period.ofDays(1).ofYears(2);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d));
	}
}
