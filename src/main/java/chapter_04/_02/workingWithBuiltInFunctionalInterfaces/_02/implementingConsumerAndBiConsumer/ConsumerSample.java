package chapter_04._02.workingWithBuiltInFunctionalInterfaces._02.implementingConsumerAndBiConsumer;

import java.util.function.Consumer;

public class ConsumerSample {
	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		c1.accept("Annie");
		c2.accept("Ochoa");
	}
}
