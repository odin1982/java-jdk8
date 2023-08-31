package chapter_04._02.workingWithBuiltInFunctionalInterfaces._01.implementingSupplier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * 
 *	@FunctionalInterface public class Supplier<T>{
 *		public T get();
 *	}
 */

public class SupplierSample {
	public static void main(String[] args) {
		
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		LocalDate localDate = s1.get();
		LocalDate localDate2 = s2.get();
		
		System.out.println(localDate);
		System.out.println(localDate2);
		
		
		Supplier<StringBuilder> s3 = StringBuilder::new;
		Supplier<StringBuilder> s4 = () -> new StringBuilder();
		
		System.out.println(s3.get());
		System.out.println(s4.get());
		
		
		Supplier<ArrayList<String>> s5 = ArrayList<String>::new;
		ArrayList<String> a1 = s5.get();
		System.out.println(a1);
	}
}
