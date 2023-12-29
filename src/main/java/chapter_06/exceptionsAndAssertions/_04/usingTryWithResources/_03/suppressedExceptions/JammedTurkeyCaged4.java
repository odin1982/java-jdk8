package chapter_06.exceptionsAndAssertions._04.usingTryWithResources._03.suppressedExceptions;

public class JammedTurkeyCaged4 implements AutoCloseable{
	public void close() throws IllegalStateException{
		throw new IllegalStateException("Cage door does not close");
	}
	
	public static void main(String[] args) {
		try(JammedTurkeyCaged4 t = new JammedTurkeyCaged4();
		    JammedTurkeyCaged4 t2 = new JammedTurkeyCaged4()){
			throw new IllegalStateException("turkeys entered cages");
		}catch(IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
			for(Throwable t: e.getSuppressed())
				System.out.println(t.getMessage());
		}
	}
}
