package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._02.manipulatingDatesAndTimes;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class AddingDaySample {
	public static void main(String[] args) {
		Date addDay = addDay(new Date());
		System.out.println(addDay);
		
		LocalDate addDay2 = addDay(LocalDate.now());
		System.out.println(addDay2);
		
		System.out.println();
		
		Date subtractDay = substractDay(new Date());
		System.out.println(subtractDay);
		
		LocalDate subtractDay2 = substractDay(LocalDate.now());
		System.out.println(subtractDay2);
	}
	
	public static Date addDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,1);
		return cal.getTime();
	}
	
	public static Date substractDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,-1);
		return cal.getTime();
	}
	
	public static LocalDate addDay(LocalDate date) {
		return date.plusDays(1);
	}
	
	public static LocalDate substractDay(LocalDate date) {
		return date.minusDays(1);
	}
}
