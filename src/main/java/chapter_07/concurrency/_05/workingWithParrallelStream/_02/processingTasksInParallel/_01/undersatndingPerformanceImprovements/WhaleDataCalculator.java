package chapter_07.concurrency._05.workingWithParrallelStream._02.processingTasksInParallel._01.undersatndingPerformanceImprovements;

import java.util.ArrayList;
import java.util.List;

public class WhaleDataCalculator {
	public int processRecord(int input) {
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			//Handle interrupted exception
		}
		return input + 1;
	}
	//without paralleStream = 63.0 seconds
	public void processAllData(List<Integer> data) {
		data.stream().map(a -> processRecord(a)).count();
	}
	
	public static void main(String[] args) {
		WhaleDataCalculator calculator = new WhaleDataCalculator();
		
		// Define the data
		List<Integer> data = new ArrayList<>();
		for(int i=0; i<4000;i++) data.add(i);
		
		// Process the data
		long start = System.currentTimeMillis();
		calculator.processAllData(data);
		double time =(System.currentTimeMillis() - start)/1000;
		
		// Report results
		System.out.println("\nTasks completed in: "  + time + " seconds");
	}
}
