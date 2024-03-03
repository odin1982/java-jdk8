package mx.javaEsencial._03.estructurasDeControl;

import java.util.Scanner;

public class ElBucleFor {
	public static void main(String[] args) {
		int resultado = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca el primer numero:");
		int numero1 = scanner.nextInt();
		System.out.println("Introduzca el segundo numero:");
		int numero2 = scanner.nextInt();
		for(int i=0; i < numero2; i++) {
			System.out.println("Iteracion numero: " + i);
			resultado += numero1;
		}
		
		System.out.println("El resultado de multiplicar " + numero1 +" por " + numero2 + " es: " + resultado);
	} 

}
