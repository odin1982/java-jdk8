package chapter_05.datesStringsLocalization._02.reviewingTheStringClass;

public class StringBuilderSample2 {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("abcde");
		s.insert(1, '-').delete(3, 4);
		System.out.println(s);
		System.out.println(s.substring(2,4));
	}
}
