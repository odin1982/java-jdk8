package mx.javaEsencial._05.otrosTiposDeDatosImportantesEnJava._09.proyecto.generadorAutomaticoDeMovimientosBancarios;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorAleatorioDeMovimientos {
	private static final String TRANSFERENCIA = "Transferencia de";
	private static final String INGRESO = "Ingreso de";
	private static final String RETIRADA = "Retirada de";
	private static final String PAGO_CON_TARJETA = "Pago con Tarjeta de";
	private static final String NOMINA = "Ingreso Nomina de";
	private static final String PAGO_RECIBO = "Pago de Recibo de";
	
	public static ArrayList<String> obtenerMovimientos(int numeroDeMovimientos,String moneda){
		ArrayList<String> movimientos = new ArrayList<>();
		for(int i=0; i < numeroDeMovimientos; i++) {
			int numeroDeMovimiento = obtenerIntAleatorio(1,6);
			String tipoDeMovimiento;
			switch(numeroDeMovimiento) {
				case 1:
					tipoDeMovimiento = TRANSFERENCIA;
					break;
				case 2:
					tipoDeMovimiento = INGRESO;
					break;
				case 3:
					tipoDeMovimiento = RETIRADA;
					break;
				case 4:
					tipoDeMovimiento = PAGO_CON_TARJETA;
					break;
				case 5:
					tipoDeMovimiento = NOMINA;
					break;
				default:
					tipoDeMovimiento = PAGO_RECIBO;
			}
			double cantidadAleatoria = obtenerDoubleAleatorio(1.0,3000.0);
			String movimiento = tipoDeMovimiento + String.format("%.2f", cantidadAleatoria) + " " + moneda;
			movimientos.add(movimiento);
			
		}
		return movimientos;
	}
	
	private static int obtenerIntAleatorio(int minimo, int maximo) {
		return ThreadLocalRandom.current().nextInt(minimo, maximo+1);
	}
	
	private static double obtenerDoubleAleatorio(double minimo, double maximo) {
		return ThreadLocalRandom.current().nextDouble(minimo, maximo+1.0);
	}

}
