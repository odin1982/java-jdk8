package chapter_06.exceptionsAndAssertions._04.usingTryWithResources._02.autocloseable;

public class ExampleTwo implements AutoCloseable{
	public void close() throws Exception{
		throw new Exception("Cage door does not close");	// throws an Exception is not recomended
	}
}
