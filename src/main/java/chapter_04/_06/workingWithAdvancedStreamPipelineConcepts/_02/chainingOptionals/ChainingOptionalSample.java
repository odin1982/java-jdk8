package chapter_04._06.workingWithAdvancedStreamPipelineConcepts._02.chainingOptionals;

import java.util.Optional;

public class ChainingOptionalSample {
	public static void main(String[] args) {
		Optional<Integer> o = Optional.of(123);
		threeDigit(o);
	}
	
	private static void threeDigit(Optional<Integer> optional) {
		if(optional.isPresent()) {
			Integer num = optional.get();
			String string = "" + num;
			if(string.length() == 3) {
				System.out.println(string);
			}
		}
	}
	
	private static void threeDigit2(Optional<Integer> optional) {
		optional.map(n-> ""+n)
			.filter(s-> s.length() == 3)
			.ifPresent(System.out::println);
	}
}
