package mx.javaEsencial._04.clasesObjetosMetodos._01.losParametros;

public class Calculadora {
	double calcularAreaCirculo(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	
	double calcularVolumenPrismaRectangular(double altura, double anchura, double profundidad) {
		return altura * anchura * profundidad;
	}
	
	double calcularMedia(double ...numeros) {
		if(numeros.length == 0)
			return 0;
		double suma = 0.0;
		for(int i=0;i<numeros.length;i++) {
			suma += numeros[i];
		}
		
		return suma/numeros.length;
	}
}
