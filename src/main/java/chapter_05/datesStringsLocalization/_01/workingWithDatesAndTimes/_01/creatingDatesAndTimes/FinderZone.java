package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._01.creatingDatesAndTimes;

import java.time.ZoneId;

public class FinderZone {
	public static void main(String[] args) {
		System.out.println(ZoneId.systemDefault());
		System.out.println();
		ZoneId.getAvailableZoneIds()
			.stream()
			.filter(z -> z.contains("US") || z.contains("America"))
			.sorted()
			.forEach(System.out::println);
	}
}
