package chapter_04._08.reviewQuestions._12;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceTest {
	public static void main(String[] args) {
		Supplier x = String::new;
		BiConsumer<String,String> y = (a,b) -> System.out.println();
		UnaryOperator<String> z = a -> a+a;
	}
}
