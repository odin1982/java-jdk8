package chapter_06.exceptionsAndAssertions._04.usingTryWithResources._03.suppressedExceptions;

public class JammedTurkeyCaged2 implements AutoCloseable{
	public void close() throws IllegalStateException{
		throw new IllegalStateException("Cage door does not close");
	}
	
	public static void main(String[] args) {
		try(JammedTurkeyCaged2 t = new JammedTurkeyCaged2()){
			throw new IllegalStateException("turkeys ran off");
		}catch(IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
			for(Throwable t: e.getSuppressed())
				System.out.println(t.getMessage());
		}
	}
}
