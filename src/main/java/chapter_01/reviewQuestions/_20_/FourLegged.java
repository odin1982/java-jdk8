package chapter_01.reviewQuestions._20_;

public class FourLegged {
	String walk = "walk,";
	
	static class BabyRinho extends FourLegged{
		String walk = "toddle,";
	}
	
	public static void main(String[] args) {
		FourLegged f = new BabyRinho();
		BabyRinho b = new BabyRinho();
		System.out.println(f.walk);
		System.out.println(b.walk);
	}
}
