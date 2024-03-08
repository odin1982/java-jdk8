package mx.codewars.explanation.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * tutorial: https://www.geeksforgeeks.org/matcher-class-in-java/
 * 
 * Matcher.matches() : Try to match the total input sequence against the
 * pattern. Matcher.lookingAt() : Try to match the input sequence, against the
 * pattern, starting at the beginning. Matcher.find() : This scans the input
 * sequence and looks for the next subsequence especially matches the pattern.
 *
 */
public class MatcherSample {
	private static final String REGEX = "[-_]";
	private static final String INPUT = "the-stealth-warrior";

	public static void main(String[] args) {
		int count = 0;
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(INPUT);
		
		while(matcher.find()) {
			count++;
			System.out.println("Match number " + count);
			System.out.println("start(): " + matcher.start());//indica el indice inicial donde se ubica la coincidencia
			System.out.println("end(): " + matcher.end());//indica el indice final de la coincidencia del String
			System.out.println("group(1): " + matcher.group(0));
			System.out.println();
		}
		
	}
}
