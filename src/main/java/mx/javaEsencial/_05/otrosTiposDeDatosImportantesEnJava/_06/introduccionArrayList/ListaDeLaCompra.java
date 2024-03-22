package mx.javaEsencial._05.otrosTiposDeDatosImportantesEnJava._06.introduccionArrayList;

import java.util.ArrayList;

public class ListaDeLaCompra {
	public static void main(String[] args) {
		ArrayList<String> listaCompra = new ArrayList<String>();
		listaCompra.add("patatas");
		listaCompra.add("leche");
		listaCompra.add("manzanas");
		System.out.println("Mi lista contiene: " + listaCompra);
		System.out.println();
		ArrayList<String> listaEnero = new ArrayList<>(listaCompra);
		listaEnero.add("harina");
		System.out.println("Mi listacompra contiene: " + listaCompra);
		System.out.println("Mi listaenero contiene: " + listaEnero);
		System.out.println();
		ArrayList<String> listaFebrero = listaCompra;
		listaFebrero.add("chocolates");
		System.out.println("Mi listacompra contiene: " + listaCompra);
		System.out.println("Mi listaenero contiene: " + listaEnero);
		System.out.println("Mi listafebrero contiene: " + listaFebrero);
		System.out.println();
		
		System.out.println("El primer elemento de la lista de enero es: " + listaCompra.get(0));
		
		listaEnero.remove(0);
		System.out.println("Mi listaenero contiene: " + listaEnero);
		
		listaEnero.remove("harina");
		System.out.println("Mi listaenero contiene: " + listaEnero);
		
		
		
	}
}
