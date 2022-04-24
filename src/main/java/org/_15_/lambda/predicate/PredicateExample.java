package org._15_.lambda.predicate;

import java.util.function.Predicate;


//interface Predicate<T>{
//	boolean test(T t);
//}

public class PredicateExample {
	public static void main(String[] args) {
		int salary = 3000;
		boolean result = salaryCheck(salary);
		System.out.println(result);
		
		Predicate<Integer> p = s -> s >= 4000;
		boolean result2 = p.test(salary);
		System.out.println(result2);
		
		
	}

	private static boolean salaryCheck(int salary) {
		if(salary>=4000) {
			return true;
		}else {
			return false;
		}
	}
	
	// salary -> salary>=4000
}
