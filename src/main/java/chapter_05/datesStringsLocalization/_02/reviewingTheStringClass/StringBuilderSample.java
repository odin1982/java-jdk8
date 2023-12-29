package chapter_05.datesStringsLocalization._02.reviewingTheStringClass;

public class StringBuilderSample {
	public static void main(String[] args) {
		StringBuilder b = new StringBuilder();
		b.append(12345).append('-');
		System.out.println(b.length());
		System.out.println(b.indexOf("-"));
		System.out.println(b.charAt(2));
		
		StringBuilder b2 = b.reverse();
		System.out.println(b.toString());
		System.out.println(b == b2);
	}
}
