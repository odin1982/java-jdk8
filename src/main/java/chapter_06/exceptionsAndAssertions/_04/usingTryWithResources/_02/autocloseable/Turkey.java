package chapter_06.exceptionsAndAssertions._04.usingTryWithResources._02.autocloseable;

public class Turkey {
	public static void main(String[] args) {
		try(Turkey t = new Turkey()){
			System.out.println(t);		//The resource type Turkey does not implement java.lang.AutoCloseable
		}
	}
}
