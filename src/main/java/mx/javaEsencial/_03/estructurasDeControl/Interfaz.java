package mx.javaEsencial._03.estructurasDeControl;

import java.util.Scanner;

import mx.javaEsencial.proyecto.v04.CajeroAutomatico;


public class Interfaz {
	public static void main(String[] args) {
		int opcionSeleccionada;
		
		System.out.println("Por favor introduzca su numero de identificación: ");
		Scanner scanner = new Scanner(System.in);
		String identificador = scanner.nextLine();
		System.out.println("Por favor introduzca su contraseña: ");
		String contrasena = scanner.nextLine();
		CajeroAutomatico cajero = new CajeroAutomatico(identificador,contrasena);
		do {

			System.out.println("Elija una de las siguinetes opciones:");
			System.out.println(" Escriba 1 para consultar su saldo");
			System.out.println(" Escriba 2 para ingresar dinero");
			System.out.println(" Escriba 3 para sacar dinero");
			System.out.println(" Escriba 4 para consultar sus ultimos movimientos");

			opcionSeleccionada = scanner.nextInt();
			
			switch(opcionSeleccionada) {
			case 1:
				cajero.mostrarSaldo();
				break;
			case 2:
				cajero.ingresarSaldo();
				break;
			case 3:
				cajero.sacarSaldo();
				break;
			case 4:
				cajero.sacarSaldo();
				break;
			default:
				cajero.salir();
			}
		} while (opcionSeleccionada >= 1 && opcionSeleccionada <= 4);
	}
}
