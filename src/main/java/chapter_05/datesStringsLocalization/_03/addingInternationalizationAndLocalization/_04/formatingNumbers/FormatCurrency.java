package chapter_05.datesStringsLocalization._03.addingInternationalizationAndLocalization._04.formatingNumbers;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatCurrency {
	public static void main(String[] args) {
		double price = 48.45;
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(us.format(price));
		
		NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(fr.format(price));
	}
}
