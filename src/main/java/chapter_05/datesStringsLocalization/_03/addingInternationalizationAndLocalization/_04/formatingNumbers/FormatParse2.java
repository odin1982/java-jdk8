package chapter_05.datesStringsLocalization._03.addingInternationalizationAndLocalization._04.formatingNumbers;

import java.text.NumberFormat;
import java.text.ParseException;

public class FormatParse2 {
	public static void main(String[] args) throws ParseException {
		String amt = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		double value = (Double)cf.parse(amt);
		System.out.println(value);
	}
}
