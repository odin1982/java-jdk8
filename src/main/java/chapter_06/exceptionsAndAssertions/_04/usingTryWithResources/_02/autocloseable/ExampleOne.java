package chapter_06.exceptionsAndAssertions._04.usingTryWithResources._02.autocloseable;

public class ExampleOne implements AutoCloseable{

	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");			// Is the best implementation
	}

}
