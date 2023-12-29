package chapter_04._03.returningAnOptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalSample {
	public static Optional<Double> average(int... scores){
		if(scores.length == 0) {
			return Optional.empty();
		}
		int sum = 0;
		for(int score:scores) {
			sum += score;
		}
		return Optional.of(((double)sum)/scores.length);
	}
	
	public static void main(String[] args) {
		System.out.println(average(1,2,3));
		System.out.println(average(1,2,3).get());
		
		Optional<Double> opt = average(90,100);
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		
//		Optional<Double> opt2 = average();
//		System.out.println(opt2.get());
		
		System.out.println(Optional.ofNullable(null));
		
		Optional<Double> o = average(90,100);
		o.ifPresent(value -> System.out.println(value));
		o.ifPresent(System.out::println);
		
		Optional<Double> opti = average();
		System.out.println(opti.orElse(Double.NaN));
		System.out.println(opti.orElseGet(()->Math.random()));
		System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
		
	}
	
}
