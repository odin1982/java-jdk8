package mx.codewars._11.exclamationMarksSeries11;

public class ExclamationMarksSeries11 {
	public static void main(String[] args) {
		System.out.println(replace("Hola"));
		
	}
	
	public static String replace(final String s) {
        return s.replaceAll("[aeiou]", "!");
    }
}
