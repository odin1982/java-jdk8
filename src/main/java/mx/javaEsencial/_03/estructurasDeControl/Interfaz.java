package mx.javaEsencial._03.estructurasDeControl;

import java.util.Scanner;

public class Interfaz {
	public static void main(String[] args) {
		int opcionSeleccionada;
		do {

			System.out.println("Elija una de las siguinetes opciones:");
			System.out.println(" Escriba 1 para consultar su saldo");
			System.out.println(" Escriba 2 para ingresar dinero");
			System.out.println(" Escriba 3 para sacar dinero");
			System.out.println(" Escriba 4 para consultar sus ultimos movimientos");

			Scanner scanner = new Scanner(System.in);
			opcionSeleccionada = scanner.nextInt();
			
			switch(opcionSeleccionada) {
			case 1:
				System.out.println("La opcion que usted ha elegido es consultar su saldo");
				break;
			case 2:
				System.out.println("La opcion que usted ha elegido es ingresar dinero");
				break;
			case 3:
				System.out.println("La opcion que usted ha elegido es sacar dinero");
				break;
			case 4:
				System.out.println("La opcion que usted ha elegido es consultar sus ultimos movimientos");
				break;
			default:
				System.out.println("Muchas gracias por usar nuestros servicios");
			}
		} while (opcionSeleccionada >= 1 && opcionSeleccionada <= 4);
	}
}
