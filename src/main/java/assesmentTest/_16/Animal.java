package assesmentTest._16;

public interface Animal {
	public default String getName() { return null; }
}

interface Mammal { 
	public default String getName() { return null; }
}

abstract class Otter implements Mammal,Animal{}

//para que no te salga el error, debes quitar la palabra reservada de los dos metodos de las interfaces y su implementación