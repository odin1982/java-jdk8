package chapter_05.datesStringsLocalization._02.reviewingTheStringClass;

public class StringClassSample {
	public static void main(String[] args) {
		String s1 = "bunny";
		String s2 = "bunny";
		String s3 = new String("bunny");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
}
