package mx.javaEsencial.proyecto.v04;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
	CuentaBancaria cuentaBancariaActual;
	
	public CajeroAutomatico(String identificador,String contraseña){
		double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,50000);
		cuentaBancariaActual = new CuentaBancaria("nombre", cantidadAleatoria);
	}
	
	public void mostrarSaldo() {
		System.out.println("Su saldo es " + cuentaBancariaActual.obtenerSaldo());
	}
	
	public void ingresarSaldo() {
		System.out.println("Cuanto dinero quiere sacar?");
		Scanner scanner = new Scanner(System.in);
		double cantidad = scanner.nextDouble();
		cuentaBancariaActual.ingresarDinero(cantidad);
	}
	
	void consultarUltimosMovimientos() {
		System.out.println("Opcion no disponible..");
	}
	
	public void sacarSaldo() {
		System.out.println("Cuanto dinero quiere sacar?");
		Scanner scanner = new Scanner(System.in);
		double cantidad = scanner.nextDouble();
		cuentaBancariaActual.sacarDinero(cantidad);
	}
	
	public void salir() {
		System.out.println("Muchas gracias por utilzar nuestros servicios");
	}
}
