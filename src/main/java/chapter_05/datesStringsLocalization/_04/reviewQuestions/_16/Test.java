package chapter_05.datesStringsLocalization._04.reviewQuestions._16;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
		long epochSeconds = 0;
		Instant instant = Instant.now();
		Instant instant2 = Instant.ofEpochSecond(epochSeconds);
		Instant instant3 = date.toInstant();
		Instant instant4 = dateTime.toInstant();
		Instant instant5 = time.toInstant();
		zonedDateTime.toInstant();
	}
}
