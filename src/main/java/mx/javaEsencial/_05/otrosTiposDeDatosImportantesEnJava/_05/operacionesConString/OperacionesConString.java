package mx.javaEsencial._05.otrosTiposDeDatosImportantesEnJava._05.operacionesConString;

public class OperacionesConString {
	public static void main(String[] args) {
		String miString = "abcde";
		char caracter;
		caracter = miString.charAt(2);
		System.out.println("El caracter en la posicion 2 es: " + caracter);
		String resultadoconcat = miString.concat("fghij");
		System.out.println("El resultado de la concatenacion es: " + resultadoconcat);
		String concatenacionSencilla = "abcde"+ "fghij";
		System.out.println("El resulatdo de concatenar con el operador suma: " + concatenacionSencilla);
		System.out.println("Son iaguales estos dos String: " + resultadoconcat.equals(concatenacionSencilla));
		System.out.println("La longitud del String resultadoconcat: " + resultadoconcat.length());
	}
}
