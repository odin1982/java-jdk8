package chapter_04._08.reviewQuestions._02;

import java.util.function.Predicate;
import java.util.stream.Stream;

// anyMatch() = El stream es infinito pero solo se ejecuta una vez ya que al hacer match con culaquier elemento la ejecucion se termina, 
// al ver que con el primer elemento hace match termina la ejecucion

// allMatch() = El stream es infinito y nunca termina las validaciones ya que revisa todos los que hacen match
public class StreamTest2 {
	public static void main(String[] args) {
		Predicate<? super String> predicate = s -> s.startsWith("g");
		Stream<String> stream1 = Stream.generate(() -> "growl! ");
		Stream<String> stream2 = Stream.generate(() -> "growl! ");
		boolean b1 = stream1.anyMatch(predicate);
		boolean b2 = stream2.allMatch(predicate);
		System.out.println(b1 + " " + b2);
	}
}
