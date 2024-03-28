package mx.javaEsencial._05.otrosTiposDeDatosImportantesEnJava._08.losGenericos;

public class Main {
	public static void main(String[] args) {
		Caja<String> caja1 = new Caja<>("Hola");
		Integer numero = 5;
		Caja<Integer> caja2 = new Caja<>(numero);
		String miObjeto = "Perro";
		System.out.println("caja1 y miObjeto tienen el mismo objeto: " + caja1.perteneceElContenidoALaMismaClase(miObjeto));
	}
}
