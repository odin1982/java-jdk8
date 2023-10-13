package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._01.creatingDatesAndTimes;

import java.time.LocalTime;
//LocalTime
public class DatesAndTimesSample3 {
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.of(6, 15); //hour, minute
		LocalTime time2 = LocalTime.of(6, 15,30);// + seonds
		LocalTime time3 = LocalTime.of(6, 15,30,200);// +nanoseconds
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
	}
}
