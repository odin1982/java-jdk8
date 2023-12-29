package chapter_06.exceptionsAndAssertions._04.usingTryWithResources._02.autocloseable;

public class ExampleThree implements AutoCloseable{
	static int COUNT = 0;

	@Override
	public void close(){
		COUNT++;				//Has a side effect. It changes the state of a variable. Side effect is not recomended
	}

}
