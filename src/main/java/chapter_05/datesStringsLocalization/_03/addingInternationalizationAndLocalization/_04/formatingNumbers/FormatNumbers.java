package chapter_05.datesStringsLocalization._03.addingInternationalizationAndLocalization._04.formatingNumbers;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {
	public static void main(String[] args) {
		int attendeesPerYear = 3_200_000;
		int attendesPerMonth = attendeesPerYear/12;
		
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendesPerMonth));
		
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendesPerMonth));
		
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendesPerMonth));
	}
}
