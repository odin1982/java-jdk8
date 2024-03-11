package mx.javaEsencial._04.clasesObjetosMetodos._05.sobrecargaDeMetodos;

public class Main {
	public static void main(String[] args) {
		Informador informador = new Informador();
		informador.mostrarPorPantalla(1);
		informador.mostrarPorPantalla("Hola");
		informador.mostrarPorPantalla("hola",Informador.COLOR_VERDE);
		informador.mostrarPorPantalla("hola",Informador.COLOR_ROJO);
	}
}
