package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._01.creatingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DatesAndTimesSample4 {
	public static void main(String[] args) {
		LocalDateTime dateTime1 = LocalDateTime.of(2015,Month.JANUARY,20,6,15,30);
		
		LocalDate date1 = LocalDate.of(2015, Month.OCTOBER, 20);
		LocalTime time1 = LocalTime.of(6,15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		
		System.out.println(dateTime1);
		System.out.println(dateTime2);
	}
}
