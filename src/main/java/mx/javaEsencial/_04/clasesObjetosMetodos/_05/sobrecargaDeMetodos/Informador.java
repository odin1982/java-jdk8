package mx.javaEsencial._04.clasesObjetosMetodos._05.sobrecargaDeMetodos;

public class Informador {
	public static final String COLOR_POR_DEFECTO= "\u001B[0m";
	public static final String COLOR_ROJO = "\u001B[31m";
	public static final String COLOR_VERDE = "\u001B[32m";
	public static final String COLOR_AMARILLO = "\u001B[33m";
	
	void mostrarPorPantalla(int entero) {
		System.out.println("Mostrando el entero: " + entero);
	}
	
	void mostrarPorPantalla(double decimal) {
		System.out.println("Mostrando el decimal: " + decimal);
	}
	
	void mostrarPorPantalla(String palabra) {
		System.out.println("Mostrando la palabra: " + palabra);
	}
	
	void mostrarPorPantalla(String palabra, String color) {
		System.out.println(color + "Mostrando la palabra con color: " + palabra + COLOR_POR_DEFECTO);
	}
}
