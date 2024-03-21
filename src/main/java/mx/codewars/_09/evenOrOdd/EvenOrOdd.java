package mx.codewars._09.evenOrOdd;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println(evenOrOdd(2));
	}
	
	public static String evenOrOdd(int number) {
		return number%2 == 0 ? "Even" : "Odd";
	}
}
