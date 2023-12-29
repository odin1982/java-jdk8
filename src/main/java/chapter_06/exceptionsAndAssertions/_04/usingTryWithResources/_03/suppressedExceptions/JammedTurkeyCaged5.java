package chapter_06.exceptionsAndAssertions._04.usingTryWithResources._03.suppressedExceptions;

public class JammedTurkeyCaged5 implements AutoCloseable{
	public void close() throws IllegalStateException{
		throw new IllegalStateException("Cage door does not close");
	}
	
	public static void main(String[] args) {
		try(JammedTurkeyCaged5 t = new JammedTurkeyCaged5()){
			throw new IllegalStateException("turkeys ran off");
		}finally {
			throw new RuntimeException("and we couldn't find them");
		}
	}
}
