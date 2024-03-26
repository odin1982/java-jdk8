package mx.javaEsencial._05.otrosTiposDeDatosImportantesEnJava._08.losGenericos;

public class Caja<T> {
	T elemento;

	public Caja(T elemento) {
		this.elemento = elemento;
	}

	public T getElemento() {
		return elemento;
	}
	
	<V> boolean perteneceElContenidoALaMismaClase(V otroObjeto) {
		return elemento.getClass() == otroObjeto.getClass();
	}
	
	
	
}
