package chapter_06.exceptionsAndAssertions.reviewQuestions._05;

import java.io.Closeable;

public class AutoCloseableFlow {
	static class Door implements AutoCloseable{
		public void close() {
			System.out.println("D");
		}
	}
	
	static class Window implements Closeable{
		public void close() {
			System.out.println("W");
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args) {
		try(Door d = new Door(); Window w = new Window()){
			System.out.println("T");
		}catch(Exception e) {
			System.out.println("E");
		}finally {
			System.out.println("F");
		}
	}
	
}
