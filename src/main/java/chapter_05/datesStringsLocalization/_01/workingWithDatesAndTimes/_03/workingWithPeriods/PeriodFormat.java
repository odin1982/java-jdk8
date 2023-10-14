package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._03.workingWithPeriods;

import java.time.Period;

public class PeriodFormat {
	public static void main(String[] args) {
		System.out.println(Period.ofMonths(3));
		System.out.println(Period.of(0, 20, 47));
		System.out.println(Period.ofWeeks(3));//son 3 semanas multiplicadas por 7 dias = 21
	}
}
