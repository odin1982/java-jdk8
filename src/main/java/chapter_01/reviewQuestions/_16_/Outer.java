package chapter_01.reviewQuestions._16_;

public class Outer {
	class Inner{}
	
	public static void main(String[] args) {
		Inner in = new Inner();
		//Inner in2 = new Outer().new Inner();
		Inner in3 = Outer.new Inner();
		Outer.Inner in4 = new Outer().Inner();
		Outer.Inner in5 = new Outer().new Inner();
		Outer.Inner in6 = Outer.new Inner();
	}
}
