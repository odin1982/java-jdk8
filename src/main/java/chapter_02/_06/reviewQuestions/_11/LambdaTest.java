package chapter_02._06.reviewQuestions._11;

public class LambdaTest {
	public static void main(String[] args) {
		Secret s = (double d) -> "Proof";
		s.magic(2.0);
	}
}
