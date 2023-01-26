package chapter_01.reviewQuestions._19_;

public class LearnToWalk {
	public void toddle() {}
	
	class BabyRinho extends LearnToWalk{
		//public void toddle() {} //ok
		//public void Toddle() {} //its not a override
		//public final void toddle() {} //ok
		//public static void toddle() {} // compilation error
		//public void toddle() throws Exception{}// compilation error
		//public void toddle(boolean fall) {} // its not a override method
	}
}
