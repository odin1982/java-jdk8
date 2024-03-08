package mx.codewars._03.multiplyTheNumber;

public class KataSolution {
	public static int multiply(int number) {
		return number * (int) Math.pow(5, (Math.abs(number) + "").length());
	}

	public static void main(String[] args) {
		int result = multiply(-3);
		System.out.println(result);
	}
}
