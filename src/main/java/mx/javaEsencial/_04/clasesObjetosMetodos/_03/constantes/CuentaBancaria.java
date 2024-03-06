package mx.javaEsencial._04.clasesObjetosMetodos._03.constantes;

public class CuentaBancaria {
	String titular;
	String tipoDeCuenta;
	double saldo;
	public static final String TIPO_AHORRO = "Ahorro";
	public static final String TIPO_NOMINA = "Nomina";
	final double COMISION = 1.2;
	
	public CuentaBancaria() {
		this.tipoDeCuenta = TIPO_AHORRO;
	}
	
	public CuentaBancaria(String titular,double saldo) {
		this.titular = titular;
		this.tipoDeCuenta = TIPO_AHORRO;
		this.saldo = saldo;
	}
	
	
	public CuentaBancaria(String titular, String tipoDeCuenta, double saldo) {
		this.titular = titular;
		this.tipoDeCuenta = tipoDeCuenta;
		this.saldo = saldo;
	}

	void sacarDinero(double cantidad) {
		if(cantidad < 0)
			return;
		double comision = 0;
		if(this.tipoDeCuenta.equals(TIPO_AHORRO)) {
			comision = COMISION;
		}
		saldo -= cantidad;
		saldo -= comision;
	}
	
	void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	void cambiarTipoDecuenta(String nuevoTipo) {
		tipoDeCuenta = nuevoTipo;
	}
	
	double obtenerSaldo() {
		return saldo;
	}

}
