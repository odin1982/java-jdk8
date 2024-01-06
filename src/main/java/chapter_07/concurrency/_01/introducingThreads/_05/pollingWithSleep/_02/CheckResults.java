package chapter_07.concurrency._01.introducingThreads._05.pollingWithSleep._02;
public class CheckResults {
	private static int counter = 0;
	
	public static void main(String[] args) throws InterruptedException {
		new Thread(() ->  {
			for(int i=0; i<500; i++)CheckResults.counter++;
		}) .start();
		
		while(CheckResults.counter < 100) {
			System.out.println("Not reached yet");
			Thread.sleep(5000);// al usar el metodo sleep se debe agregar throws InterruptedException
		}
		
		System.out.println("Reached!");
	}
}