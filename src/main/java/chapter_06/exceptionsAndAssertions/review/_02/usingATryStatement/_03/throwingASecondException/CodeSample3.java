package chapter_06.exceptionsAndAssertions.review._02.usingATryStatement._03.throwingASecondException;

public class CodeSample3 {
	public static void main(String[] args) {
		System.out.println(exceptions());
	}
	
	public static String exceptions() {
		String result = "";
		String v = null;
		
		try {
			try {
				result += "before ";
				v.length();
				result += "after ";
			}catch(NullPointerException e) {
				result += "catch ";
				throw new RuntimeException();
			}finally {
				result += "finally ";
				throw new Exception();
			}
		}catch(Exception e) {
			result += "done";
		}
		return result;
	}
}
