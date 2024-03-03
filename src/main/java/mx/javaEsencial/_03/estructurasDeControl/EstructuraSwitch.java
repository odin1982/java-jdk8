package mx.javaEsencial._03.estructurasDeControl;

import java.util.Scanner;

public class EstructuraSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, introduzca el dia de la semana en que quiere su cita");
		String dia = scanner.nextLine();

		switch (dia) {
		case "lunes":
			System.out.println("El lunes puede venir de 6:00 am a 7:00 am");
			break;
		case "martes":
			System.out.println("El lunes puede venir de 7:00 am a 8:00 am");
			break;
		case "miercoles":
			System.out.println("El lunes puede venir de 8:00 am a 9:00 am");
			break;
		case "jueves":
			System.out.println("El lunes puede venir de 9:00 am a 10:00 am");
			break;
		case "viernes":
			System.out.println("El lunes puede venir de 10:00 am a 11:00 am");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Cerrado");
			break;
		default:
			System.out.println("Opcion invalida");

		}
	}
}
