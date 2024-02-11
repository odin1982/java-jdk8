package chapter_07.concurrency._05.workingWithParrallelStream._03.processingParallelReductions._01.combiningResultsWithReduce;

import java.util.Arrays;
// Como no es un acumulador asociativos el resultado puede variar
public class NonAssociativeAcumulatorSample {
	public static void main(String[] args) {
		System.out.println( Arrays.asList(1,2,3,4,5,6).parallelStream().reduce(0, (a, b)->(a-b)));//NON ASSOCIATIVE ACUMULATOR
	}
}
