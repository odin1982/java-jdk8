package chapter_06.exceptionsAndAssertions._04.usingTryWithResources._03.suppressedExceptions;

public class JammedTurkeyCaged3 implements AutoCloseable{
	public void close() throws IllegalStateException{
		throw new IllegalStateException("Cage door does not close");
	}
	
	public static void main(String[] args) {
		try(JammedTurkeyCaged3 t = new JammedTurkeyCaged3()){
			throw new RuntimeException("turkeys ran off");
		}catch(IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		}
	}
}
