package chapter_06.exceptionsAndAssertions._04.usingTryWithResources._02.autocloseable;

public class TurkeyCage implements AutoCloseable{
	
	@Override
	public void close(){
		System.out.println("Close gate");
	}
	
	public static void main(String[] args) {
		try(TurkeyCage t = new TurkeyCage()){
			System.out.println(t);		
		}
	}
}
