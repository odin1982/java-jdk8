package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._05.workingWithInstants;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantSamples2{
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015,5,25);
		LocalTime time = LocalTime.of(11, 55,0);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time,zone);
		Instant instant = zonedDateTime.toInstant();
		System.out.println(zonedDateTime);
		System.out.println(instant);
	}
}
