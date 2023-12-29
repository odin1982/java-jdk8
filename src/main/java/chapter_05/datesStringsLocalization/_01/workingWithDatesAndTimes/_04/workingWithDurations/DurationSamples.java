package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._04.workingWithDurations;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationSamples {
	public static void main(String[] args) {
		Duration daily = Duration.ofDays(1);
		Duration hourly = Duration.ofHours(1);
		Duration everyMinute = Duration.ofMinutes(1);
		Duration everyTenSeconds = Duration.ofSeconds(10);
		Duration everyMilli = Duration.ofMillis(1);
		Duration everyNano = Duration.ofNanos(1);
		
		Duration daily2 = Duration.of(1, ChronoUnit.DAYS);
		Duration hourly2 = Duration.of(1, ChronoUnit.HOURS);
		Duration everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);
		Duration everyTenSeconds2 = Duration.of(1, ChronoUnit.SECONDS);
		Duration everyMilli2 = Duration.of(1, ChronoUnit.MILLIS);
		Duration everyNano2 = Duration.of(1, ChronoUnit.NANOS);
	}
}
