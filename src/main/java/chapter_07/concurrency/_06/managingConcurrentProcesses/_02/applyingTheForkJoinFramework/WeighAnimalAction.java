package chapter_07.concurrency._06.managingConcurrentProcesses._02.applyingTheForkJoinFramework;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class WeighAnimalAction extends RecursiveAction{
	private int start;
	private int end;
	private Double[] weights;
	
	public WeighAnimalAction(int start, int end, Double[] weights) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}
	
	protected void compute() {
		if(end-start <= 3) {
			for(int i=start;i<end;i++) {
				weights[i] = (double)new Random().nextInt(100);
				System.out.println("Animal Weighed: " + i);
			}
		}else {
			int middle = start + ((end-start)/2);
			System.out.println("[start=]" + start+ ",middle=" + middle + ",end="+end+"]");
			invokeAll(new WeighAnimalAction(start, middle,weights),new WeighAnimalAction(start, middle, weights));
		}
	}
	
	public static void main(String[] args) {
		Double[] weights = new Double[10];
		ForkJoinTask<?> task = new WeighAnimalAction(0, weights.length, weights);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		
		System.out.println();
		System.out.println("Weights: ");
		Arrays.asList(weights).stream().forEach(d -> System.out.println(d.intValue() + " "));
	}
	
	
}
