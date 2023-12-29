package chapter_06.exceptionsAndAssertions.review._02.usingATryStatement._03.throwingASecondException;

public class CodeSample2 {
	public static void main(String[] args) throws Exception {
		try {
			throw new RuntimeException();
		}catch(RuntimeException e) {
			throw new RuntimeException();// esta excepcion no se lanza ya que hay un finally si no lo hubiera se lanzaria
		}finally {
			throw new Exception();
		}
	}
}
