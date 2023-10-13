package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._01.creatingDatesAndTimes;

import java.time.LocalDate;
import java.time.Month;
//LocalDate
public class DatesAndTimesSample2 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2023,Month.OCTOBER, 11);
		LocalDate date2 = LocalDate.of(2023,10, 11);
		
		System.out.println(date1);
		System.out.println(date2);
	}
}
