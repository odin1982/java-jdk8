package mx.javaEsencial._04.clasesObjetosMetodos._01.losParametros;

public class Main {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		double area = calculadora.calcularAreaCirculo(4.0);
		System.out.println("area: " + area);
		
		System.out.println("El volumen del prisma es: " + calculadora.calcularVolumenPrismaRectangular(5, 4, 8));
		
		System.out.println("La media es: "+ calculadora.calcularMedia(2.6,3.8,1.3));
	}

}
