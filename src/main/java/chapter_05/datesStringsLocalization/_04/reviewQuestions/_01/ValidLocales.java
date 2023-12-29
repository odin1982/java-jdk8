package chapter_05.datesStringsLocalization._04.reviewQuestions._01;

import java.util.Locale;

public class ValidLocales {
	public static void main(String[] args) {
		new Locale("hi");
		new Locale("hi","IN");
		new Locale("IN");
		new Locale("IN","hi");
		Locale.create("hi");
		Locale.create("IN");
	}
}
