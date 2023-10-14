package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._03.workingWithPeriods;

import java.time.LocalDate;
import java.time.Month;

public class PeriodSample {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015,Month.JANUARY,1);
		LocalDate end = LocalDate.of(2015,Month.MARCH,30);
		performAnimalEnrichment(start,end);
	}
	
	private static void performAnimalEnrichment(LocalDate start,LocalDate end) {
		LocalDate upTo = start;
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1);
		}
	}
}
