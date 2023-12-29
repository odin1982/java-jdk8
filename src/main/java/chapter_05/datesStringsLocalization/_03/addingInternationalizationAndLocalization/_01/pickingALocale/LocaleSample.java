package chapter_05.datesStringsLocalization._03.addingInternationalizationAndLocalization._01.pickingALocale;

import java.util.Locale;

public class LocaleSample {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		System.out.println();
		
		System.out.println(Locale.GERMAN);
		System.out.println(Locale.GERMANY);
		
		System.out.println();
		
		System.out.println(new Locale("fr"));
		System.out.println(new Locale("hi","IN"));
		
		System.out.println();
		
		Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale l2 = new Locale.Builder().setRegion("US").setLanguage("en").build(); 
	}
}
