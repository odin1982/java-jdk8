package chapter_07.concurrency._02.creatingThreadsWithTheExecutorService._04.waitingForResults._01.IntroducingCallable;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class AmbiguousLambdaSample {
	public static void useCallable(Callable<Integer> expresiion) {}//as Callable is permitted to throw checked exceptions
	public static void useSupplier(Supplier<Integer> expression) {}
	public static void use(Supplier<Integer> expression) {}
	public static void use(Callable<Integer> expression) {}
	public static void main(String[] args) {
		useCallable(()->{throw new IOException();}); //COMPILES
		useSupplier(()->{throw new IOException();});
		use(()->{throw new IOException();});
		use((Callable<Integer>)()->{throw new IOException();});
	}
}
