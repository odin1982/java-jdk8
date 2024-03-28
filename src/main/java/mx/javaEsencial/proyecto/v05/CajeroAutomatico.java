package mx.javaEsencial.proyecto.v05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import mx.javaEsencial._05.otrosTiposDeDatosImportantesEnJava._09.proyecto.generadorAutomaticoDeMovimientosBancarios.GeneradorAleatorioDeMovimientos;

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
		System.out.println("Cuanto dinero quiere ingresar?");
		Scanner scanner = new Scanner(System.in);
		double cantidad = scanner.nextDouble();
		cuentaBancariaActual.ingresarDinero(cantidad);
	}
	
	public void consultarUltimosMovimientos() {
		GeneradorAleatorioDeMovimientos generador = new GeneradorAleatorioDeMovimientos();
		System.out.println("Cuantos movimientos quiere consultar?");
		Scanner scanner = new Scanner(System.in);
		int numeroDeMovimientos = scanner.nextInt();
		ArrayList<String> movimientos = generador.obtenerMovimientos(numeroDeMovimientos, "euros");
		mostrarMovimientos(movimientos);
	}
	
	private void mostrarMovimientos(List<String> movimientos) {
		movimientos.stream().forEach(System.out::println);
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
