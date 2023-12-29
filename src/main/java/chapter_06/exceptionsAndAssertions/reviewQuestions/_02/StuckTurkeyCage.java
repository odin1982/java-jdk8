package chapter_06.exceptionsAndAssertions.reviewQuestions._02;

public class StuckTurkeyCage implements AutoCloseable{
	public void close() throws Exception{
		throw new Exception("Cage door does not close");
	}
	
	public static void main(String[] args) {
		try(StuckTurkeyCage t = new StuckTurkeyCage()){
			System.out.println("put turkeys in");
		}
	}
}
