package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._01.creatingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatesAndTimesSample5 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2023,Month.OCTOBER, 11);
		LocalTime time1 = LocalTime.of(6, 15);
		LocalDateTime dateTime1 = LocalDateTime.of(2015,Month.JANUARY,20,6,15,30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zoned1 = ZonedDateTime.of(2015,1,20,6,15,30,200, zone);
		ZonedDateTime zoned2 = ZonedDateTime.of(date1,time1,zone);
		ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1,zone);
		
	}
}
