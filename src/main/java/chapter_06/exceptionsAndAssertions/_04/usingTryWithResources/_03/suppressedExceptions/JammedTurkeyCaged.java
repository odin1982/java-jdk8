package chapter_06.exceptionsAndAssertions._04.usingTryWithResources._03.suppressedExceptions;

public class JammedTurkeyCaged implements AutoCloseable{
	public void close() throws IllegalStateException{
		throw new IllegalStateException("Cage door does not close");
	}
	
	public static void main(String[] args) {
		try(JammedTurkeyCaged t = new JammedTurkeyCaged()){
			System.out.println("put turkeys in");
		}catch(IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		}
	}
}
