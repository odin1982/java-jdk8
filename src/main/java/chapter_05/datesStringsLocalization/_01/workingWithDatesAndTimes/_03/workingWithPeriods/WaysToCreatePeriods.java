package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._03.workingWithPeriods;

import java.time.Period;

public class WaysToCreatePeriods {
	public static void main(String[] args) {
		Period anually = Period.ofYears(1);
		Period quartely = Period.ofMonths(3);
		Period everyThreeWeeks = Period.ofWeeks(3);
		Period everyOtherDay = Period.ofDays(2);
		Period everyYearAndWeek = Period.of(1, 0, 7);
		//Period wrong = Period.ofYears(1).ofWeeks(1);
		
		Period wrong = Period.ofYears(1);
		wrong = Period.ofWeeks(1); 
	}
}
