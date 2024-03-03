package mx.javaEsencial._03.estructurasDeControl;

import java.util.Scanner;

public class ElBucleDoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero;
		do {
			System.out.println("Introduce un numero y le mostraremos la raiz cuadrada. Para salir introduzca 0");
			numero = scanner.nextDouble();
			if(numero == 0)
				System.out.println("Hasta la vista!!");
			else
				System.out.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
		}while(numero !=0);
	}
}
