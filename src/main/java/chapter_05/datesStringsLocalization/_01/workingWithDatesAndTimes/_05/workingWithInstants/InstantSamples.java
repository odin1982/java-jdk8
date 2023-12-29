package chapter_05.datesStringsLocalization._01.workingWithDatesAndTimes._05.workingWithInstants;

import java.time.Duration;
import java.time.Instant;

public class InstantSamples {
	public static void main(String[] args) {
		Instant now = Instant.now();
		for(int i= 0 ; i<10000; i++) {
			System.out.println("hola");
		}
		Instant after = Instant.now();
		
		Duration duration = Duration.between(now, after);
		System.out.println(duration.toMillis());
	}
}
