package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._03.workingWithPeriods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodSamples {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		Period period = Period.ofMonths(1);
		System.out.println(date.plus(period));
		System.out.println(dateTime.plus(period));
		System.out.println(time.plus(period));//UnsupportedTemporalTypeException
		
	}
}
