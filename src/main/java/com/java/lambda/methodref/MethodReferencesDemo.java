package com.java.lambda.methodref;

import com.java.lambda.functional.FunctionDemo;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}

public class MethodReferencesDemo {
	public void display(String msg){
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public static int addition(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		//1. Method reference to a static method
		Function<Integer,Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(5));
		
		// using method reference
		//Function<Integer,Double> functionmethodRef = (input) -> Math.sqrt(input);
		Function<Integer,Double> functionmethodRef = Math::sqrt;
		System.out.println(functionmethodRef.apply(3));
		
		//lambda expresion
		//BiFunction<Integer,Integer,Integer> biFunctionLambda =  (a,b) -> MethodReferencesDemo.addition(a, b);
		BiFunction<Integer,Integer,Integer> biFunctionLambda =  MethodReferencesDemo::addition;
		System.out.println(biFunctionLambda.apply(1, 2));


		//2. Method reference to an instance method of an object
		MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();

		//lambda expression
		Printable printable = (msg) -> methodReferencesDemo.display(msg);
		printable.print("hello world");


		Printable printable2 = methodReferencesDemo::display;
		printable2.print("hola mundo");

		//3. Reference to the instance method of an arbitrary object
		// Sometimes, we call a method of argument in the lambda expression.
		// In that case, we can use a method reference to call an instance
		// method of an arbitrary object of a specific type

		Function<String,String> stringFunction = input -> input.toLowerCase();
		System.out.println(stringFunction.apply("Hola Mundo"));


		Function<String,String> stringFunction2 = input -> input.toLowerCase();
		Function<String,String> stringFunction3 = String::toLowerCase;
		System.out.println(stringFunction3.apply("Hola MunDo"));

		String[] strArray = {"A","E","I","O","U","a","e","i","o","u"};
		Arrays.sort(strArray,(s1,s2) -> s1.compareToIgnoreCase(s2));

		Arrays.sort(strArray,String::compareToIgnoreCase);


		//4. Reference to a constructor
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermelon");
		fruits.add("mango");

		Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruits);
		System.out.println(setFunction.apply(fruits));

		Function<List<String>, Set<String>> setFunction2 = (fruitsList) -> new HashSet<>(fruits);
		Function<List<String>, Set<String>> setFunction3 = HashSet::new;
		System.out.println(setFunction3.apply(fruits));



		
		
		
	}
}
